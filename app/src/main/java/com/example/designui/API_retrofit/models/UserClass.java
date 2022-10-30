package com.example.designui.API_retrofit.models;

import com.google.gson.annotations.SerializedName;


public class UserClass {
    @SerializedName("id")
    private String id;
    @SerializedName("username")
    private String username;
    @SerializedName("phone")
    private String pone;
    @SerializedName("email")
    private String email;
    @SerializedName("address")
    private Address address;

    public UserClass(String id, String username, String pone, String email, Address address) {
        this.id = id;
        this.username = username;
        this.pone = pone;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPone() {
        return pone;
    }

    public void setPone(String pone) {
        this.pone = pone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", pone='" + pone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
