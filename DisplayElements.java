package com.example.cs478_project2;

public class DisplayElements {
    private int pictureID;
    private String phoneInfo;
    private String phoneSpecs;

    public void setPictureID(int id){
        pictureID = id;
    }

    public void setPhoneInfo(String s){
        phoneInfo = s;
    }

    public void setPhoneSpecs(String s){
        phoneSpecs = s;
    }

    public int getPictureID(){
        return pictureID;
    }

    public String getPhoneInfo(){
        return phoneInfo;
    }

    public String getPhoneSpecs(){
        return phoneSpecs;
    }

}//End of DisplayElements class
