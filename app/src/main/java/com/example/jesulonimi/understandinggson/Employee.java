package com.example.jesulonimi.understandinggson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("firstName")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;
    @SerializedName("address")
    private Address mAddress;
    @SerializedName("Family")
    private List<FamilyMembers> familyList;

    public Employee(String firstName, int age, String mail,Address address,List<FamilyMembers> familyList) {
        this.mFirstName = firstName;
        this.mAge = age;
        this.mMail = mail;
        this.mAddress=address;
        this.familyList=familyList;
    }
}
