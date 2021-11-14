package com.example.interntask;

public class FriendModel {
    private int profile,rupee;
    private String name,status,money,due;


    public FriendModel(int profile, int rupee, String name, String status,String money,String due) {
        this.profile = profile;
        this.rupee = rupee;
        this.name = name;
        this.status = status;
        this.money = money;
        this.due = due;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getRupee() {
        return rupee;
    }

    public void setRupee(int rupee) {
        this.rupee = rupee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }
}
