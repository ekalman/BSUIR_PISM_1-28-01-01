package com.company.Visitor;

public interface Visitor {
    String visitCustomer(Customer customer);
    String visitAdmin(Admin admin);
}
