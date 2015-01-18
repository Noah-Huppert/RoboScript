package com.noahhuppert.robocode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Noah Huppert on 1/17/2015.
 */
public class FileLoader {
    public static ArrayList<String> getLines(String filePath) throws IOException{
        return (ArrayList) Files.readAllLines(Paths.get(filePath));
    }
}
