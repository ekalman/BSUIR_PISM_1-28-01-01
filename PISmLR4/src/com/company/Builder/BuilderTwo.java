package com.company.Builder;

public class BuilderTwo implements Builder {
    @Override
    public String setMight() {
        return " may supervise an order. ";
    }

    public String getResult() {
        return "Access was given.";
    }
}
