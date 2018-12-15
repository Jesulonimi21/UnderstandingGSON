package com.example.jesulonimi.understandinggson;

import com.google.gson.annotations.SerializedName;

public class FamilyMembers {
    @SerializedName("role")
    private String role;
    @SerializedName("age")
    private int age;

    public FamilyMembers(String role, int age) {
        this.role = role;
        this.age = age;
    }
}
