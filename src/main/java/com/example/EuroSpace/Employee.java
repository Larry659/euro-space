package com.example.EuroSpace;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String postion;
    private Integer age;
    private ArrayList<String> familyMembers;
    private String address;


    public Employee(String name, String postion, Integer age, ArrayList<String> familyMembers, String address) {
        this.name = name;
        this.postion = postion;
        this.age = age;
        this.familyMembers = familyMembers;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<String> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(ArrayList<String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
