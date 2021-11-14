package com.example.interntask;

public class UpcomingModel {

    private  int userImage,rupeeSymobl;
    private String sendName,name,toYou,date,rupee;

    public UpcomingModel(int userImage, String sendName, String name, String toYou, String date,int rupeeSymbol, String rupee) {
        this.userImage = userImage;
        this.sendName = sendName;
        this.name = name;
        this.toYou = toYou;
        this.date = date;
        this.rupeeSymobl = rupeeSymbol;
        this.rupee = rupee;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToYou() {
        return toYou;
    }

    public void setToYou(String toYou) {
        this.toYou = toYou;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRupeeSymobl() {
        return rupeeSymobl;
    }

    public void setRupeeSymobl(int rupeeSymobl) {
        this.rupeeSymobl = rupeeSymobl;
    }

    public String getRupee() {
        return rupee;
    }

    public void setRupee(String rupee) {
        this.rupee = rupee;
    }
}
