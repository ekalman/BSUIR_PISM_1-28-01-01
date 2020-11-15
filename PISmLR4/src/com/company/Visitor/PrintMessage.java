package com.company.Visitor;

public class PrintMessage implements Visitor {
    @Override
    public String visitCustomer(Customer customer) {
        PrintMessage(customer.getMessage());
        return null;
    }

    @Override
    public String visitAdmin(Admin admin) {
        PrintMessage(admin.getMessage());
        return null;
    }

    private void PrintMessage(String message){
        System.out.println(message);
    }
}
