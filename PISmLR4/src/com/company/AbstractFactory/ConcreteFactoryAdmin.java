package com.company.AbstractFactory;

public class ConcreteFactoryAdmin implements AbstractFactory {
    private String customer_right = "can't order a book from the catalog";
    private String admin_right = "can supervise an order as a manager";

    @Override
    public String customerRight() {
        return customer_right;
    }
    @Override
    public String adminRight() {
        return admin_right;
    }

    public String AccessMessage() {
        return "Admin's rights are the following:\nCustomer Right 2: " + this.customerRight() +
                ", Admin Right 2: " + this.adminRight() + "\n";
    }

}