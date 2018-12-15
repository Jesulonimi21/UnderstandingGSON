package com.example.jesulonimi.understandinggson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gSon = new Gson();

//        List<FamilyMembers> familyList=new ArrayList<>();
//        familyList.add(new FamilyMembers("sister",28));
//        familyList.add(new FamilyMembers("cousin",19));
//        Address address = new Address("Nigeria", "Lagos");
//
//        Employee employee = new Employee("Jesulonimi", 17, "anjola4jeez@gmail.com", address,familyList);
//        String detailsGson = gSon.toJson(employee);
//
            String jSon="{\"Family\":[{\"age\":28,\"role\":\"sister\"},{\"age\":19,\"role\":\"cousin\"}],\"address\":{\"city\":\"Lagos\",\"country\":\"Nigeria\"},\"age\":17,\"firstName\":\"Jesulonimi\",\"mail\":\"anjola4jeez@gmail.com\"}";
        Employee employee=gSon.fromJson(jSon,Employee.class);


    }
}
