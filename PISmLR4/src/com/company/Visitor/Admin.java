package com.company.Visitor;

public class Admin extends PrintMessage{
    private String seniority;
    private String politeness;
    public String message = "I may only order a book and patiently wait for it...";

    public Admin(String seniority, String politeness) {
        this.seniority = seniority;
        this.politeness = politeness;
    }

    public String getSeniority() {
        return this.seniority;
    }

    public String getPoliteness() {
        return this.politeness;
    }

    public String getMessage() {
        return this.message;
    }

    public String accept(Visitor visitor) {
        return visitor.visitAdmin(this);
    }
}
