package com.example.adapter;

public class NumberView {
    private int imageId;
    private String textId1;
    private String textId2;

    public NumberView(int imageId,String textId1,String textId2)
    {
        this.imageId=imageId;
        this.textId1=textId1;
        this.textId2=textId2;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTextId1() {
        return textId1;
    }

    public String getTextId2() {
        return textId2;
    }


}
