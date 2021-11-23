package com.company;

public class User {
    String name;
    String emailID;
    long phoneNumber;
    int age;

    User(String name, String emailID, long phoneNumber, int age){
        this.name = name;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    Location location;

    public String getCurrentLocation(){
        return location.myCurrentLocation;
    }

    public void display(){
        System.out.println("\n--------User Details--------\n\nName: " + name + "\nAge: " + age + "\nPhone Number: " + phoneNumber);
    }
}
