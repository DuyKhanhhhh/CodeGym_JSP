package com.example.bai2_jsp_jstl1;

public class Member {
    private String name;
    private String birth;
    private String address;
    private String image;

    public Member(String name, String birth, String address, String image) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
