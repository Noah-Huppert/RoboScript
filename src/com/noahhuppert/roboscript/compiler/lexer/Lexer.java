package com.noahhuppert.roboscript.compiler.lexer;

import com.noahhuppert.roboscript.compiler.Location;
import com.noahhuppert.roboscript.compiler.lexer.tokens.LexerStreamMode;
import com.noahhuppert.roboscript.compiler.lexer.tokens.Token;
import com.noahhuppert.roboscript.compiler.lexer.tokens.TokenType;
import com.noahhuppert.roboscript.compiler.lexer.tokens.keywords.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noah Huppert on 1/18/2015.
 */
public class Lexer {
    /* Actions */
    public BufferedReader loadFileStream(String relativePath, PrintStream out){
        if(relativePath.charAt(0) != '\\' || relativePath.charAt(0) != '/'){
            relativePath = "/" + relativePath;
        }
        
        String filePath = System.getProperty("user.dir") + relativePath;
        filePath = filePath.replace('\\', '/');
        
        try{
            Charset charset = Charset.forName("UTF-8");
            BufferedReader reader = Files.newBufferedReader(Paths.get(filePath), charset);
            return reader;
        } catch(IOException e) {
            out.println("[ERROR] Lexer.loadFileStream - " + e);
            return null;
        }
    }
    
    public List<Token> getFileTokens(BufferedReader reader, PrintStream out){
        List<Token> tokens = new ArrayList<Token>();
        
        try{
            int line = 1;
            int column = 0;
            
            String tokenChars = "";
            int readerResult = 0;
            LexerStreamMode streamMode = null;

            while((readerResult = reader.read()) != -1) {
                char c = (char) readerResult;
                LexerStreamMode currentCharType = null;

                column ++;
                
                if(c == '\n'){
                    line ++;
                    column = 0;
                }

                Location location = new Location(line, column);

                if (Character.isLetter(c)) {
                    currentCharType = LexerStreamMode.ALPHA;
                } else if (Character.isDigit(c)) {
                    currentCharType = LexerStreamMode.NUMERIC;
                } else if (Character.isSpaceChar(c) || c == '\n' || (int)c == 13) {
                    currentCharType = LexerStreamMode.IGNORED;
                } else{
                    currentCharType = LexerStreamMode.OTHER;
                }

                if(currentCharType == LexerStreamMode.IGNORED){
                    streamMode = null;
                    tokens.add(new Token(null, tokenChars, location));
                    tokenChars = "";
                } else if(currentCharType == LexerStreamMode.OTHER){
                    streamMode = null;
                    tokens.add(new Token(null, tokenChars, location));
                    tokens.add(new Token(null, "" + c, location));
                    tokenChars = "";
                } else if(streamMode == null){
                    streamMode = currentCharType;
                    tokenChars += c;
                } else if(streamMode == currentCharType){
                    tokenChars += c;
                } else if(streamMode != currentCharType){
                    streamMode = null;
                    tokens.add(new Token(null, tokenChars, location));
                    tokenChars = "" + c;
                }
            }
            

            
            List<Token> parsedTokens = new ArrayList<Token>();
            
            for(Token token : tokens){
                if(token.getCharacters().length() != 0) {
                    if(AssignmentOperatorKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.ASSIGNMENT_OPERATOR);
                    } else if(BooleanKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.LITERAL);
                    } else if(BooleanOperatorKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.BOOLEAN_OPERATOR);
                    } else if(ConditionalKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.CONDITIONAL);
                    } else if(token.getCharacters().equals(ExpressionKeywords.END)){
                        token.setType(TokenType.EXPRESSION_END);
                    } else if(token.getCharacters().equals(ExpressionKeywords.BLOCK_START)){
                        token.setType(TokenType.EXPRESSION_BLOCK_START);
                    } else if(token.getCharacters().equals(ExpressionKeywords.BLOCK_END)){
                        token.setType(TokenType.EXPRESSION_BLOCK_END);
                    } else if(LiteralDelimiterKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.LITERAL_DELIMITER);
                    } else if(OperatorKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.OPERATOR);
                    } else if(token.getCharacters().equals(OptionsKeywords.DELIMITER)){
                        token.setType(TokenType.OPTIONS_DELIMITER);
                    } else if(token.getCharacters().equals(OptionsKeywords.START)){
                        token.setType(TokenType.OPTIONS_START);
                    } else if(token.getCharacters().equals(OptionsKeywords.END)){
                        token.setType(TokenType.OPTIONS_END);
                    } else if(TypeKeywords.AS_LIST.contains(token.getCharacters())){
                        token.setType(TokenType.TYPE);
                    } else {
                        token.setType(TokenType.IDENTIFIER);
                    }

                    parsedTokens.add(token);
                }
            }
            
            return parsedTokens;
        } catch(IOException e){
            out.println("[ERROR] Lexer.getFileTokens() - Error reading file " + e);
            return null;
        }
    }
    
    public List<Token> getFileTokens(String relativePath, PrintStream out){
        BufferedReader reader = loadFileStream(relativePath, out);
        
        return getFileTokens(reader, out);
    }
}
