package com.company.Visitor;

public class Customer {
    private String name;
    private String id;
    private String message;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getMessage(){
        return this.message;
    }

    public String accept(Visitor visitor) {
        return visitor.visitCustomer(this);
    }
}
