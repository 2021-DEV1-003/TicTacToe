package com.example.app.model;

public class Cells {

    private int rowNum;
    private int colNum;
    private String value;

    public Cells() {
    }

    public Cells(int rowNum, int colNum, String value) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.value = value;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColNum() {
        return colNum;
    }

    public void setColNum(int colNum) {
        this.colNum = colNum;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
