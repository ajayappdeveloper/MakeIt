package com.example.model;

public class Tester extends Employee {

    boolean isKnownAutomation;

    public Tester(String fName, String lName, String designation, float exp, String email, String ph, boolean isKnownAutomation) {
        super(fName, lName, designation, exp, email, ph);
        this.isKnownAutomation = isKnownAutomation;
    }

    public void setKnownAutomation(boolean isKnownAutomation){
        this.isKnownAutomation = isKnownAutomation;
    }
    public boolean getKnownAutomation(){
        return this.isKnownAutomation;
    }
}
