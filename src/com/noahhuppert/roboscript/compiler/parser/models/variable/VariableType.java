package com.noahhuppert.roboscript.compiler.parser.models.variable;

/**
 * Created by Noah Huppert on 1/20/2015.
 */
public class VariableType<DataType> {
    private String keyword;
    private Class<DataType> dataTypeClass;
    
    public VariableType(String keyword, Class<DataType> dataTypeClass){
        this.keyword = keyword;
        this.dataTypeClass = dataTypeClass;
    }
    
    /* Getters */
    public Class<DataType> getDataTypeClass() {
        return dataTypeClass;
    }

    public String getKeyword() {
        return keyword;
    }

    /* Setters */
    public void setDataTypeClass(Class<DataType> dataTypeClass) {
        this.dataTypeClass = dataTypeClass;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
