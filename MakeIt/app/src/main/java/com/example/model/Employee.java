package com.example.model;

public class Employee {

    String firstName;
    String lastName;
    String designation;
    float experience;
    String emailId;
    String contact;

    public Employee(String fName,String lName,String designation, float exp, String email, String ph){
        this.firstName = fName;
        this.lastName = lName;
        this.designation = designation;
        this.experience = exp;
        this.emailId = email;
        this.contact = ph;
    }

    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setDesignation(String des){
        this.designation = des;
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setExperience(float exp){
        this.experience = exp;
    }

    public float getExperience(){
        return this.experience;
    }

    public void setEmailId(String email){
        this.emailId = email;
    }

    public String getEmailId(){
        return this.emailId;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }

}
