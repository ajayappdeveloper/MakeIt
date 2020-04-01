package com.example.model;

public class Developer extends Employee {

    boolean isFullStackDeveloper;

    public Developer(String fName, String lName, String designation, float exp, String email, String ph,boolean isFullStackDeveloper) {
        super(fName, lName, designation, exp, email, ph);
        this.isFullStackDeveloper=isFullStackDeveloper;
    }

    public void setFullStackDeveloper(boolean isFullStackDeveloper){
        this.isFullStackDeveloper = isFullStackDeveloper;
    }
    public boolean getFullStackDeveloper(){
        return this.isFullStackDeveloper;
    }
}
