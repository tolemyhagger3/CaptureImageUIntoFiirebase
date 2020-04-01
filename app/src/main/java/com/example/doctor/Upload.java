package com.example.doctor;

public class Upload {
    private String mName;
    private String ImageUrl;

    public Upload() {

    }

    public Upload(String name, String imageUrl) {

        if(name.trim().equals("")){
            name="No Name";
        }
        mName = name;
        ImageUrl = imageUrl;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
