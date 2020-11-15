package com.company.AbstractFactory;

public class ConcreteFactoryCustomer implements AbstractFactory {
    private String customer_right = "can change the info on his personal page (for instance, address)";
    private String admin_right = "can't see the list of all customers on the platform";

    @Override
    public String customerRight() {
        return customer_right;
    }

    @Override
    public String adminRight() {
        return admin_right;
    }

    public String AccessMessage() {
        return "Admin's rights are the following:\nCustomer Right 1: " + this.customerRight() +
                ", Admin Right 1: " + this.adminRight() + "\n";
    }
}
