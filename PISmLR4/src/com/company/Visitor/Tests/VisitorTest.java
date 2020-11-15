package com.company.Visitor.Tests;
import com.company.Visitor.Admin;
import com.company.Visitor.Customer;
import com.company.Visitor.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    public void testMain(){
        String[] args = null;
        Main.main(args);
        System.out.println("Testing of Main has passed");
        assertEquals(2,3);

    }

    @Test
    public void testCustomerCreation(){
//        Customer customer = new Customer("Mike", "567");
        Customer customer = new Customer("Piter", "568");
        assertEquals(Customer.class, customer.getClass());
        assertEquals("Mike", customer.getName());
        assertEquals("567", customer.getId());
    }

    @Test
    public void testAdminCreation(){
//        Admin admin = new Admin("2 month", "rude");
        Admin admin = new Admin("3 month", "polite");
        assertEquals(Admin.class, admin.getClass());
        assertEquals("2 month", admin.getSeniority());
        assertEquals("rude", admin.getPoliteness());
//        String expected_message = "I may only order a book and patiently wait for it...";
        String expected_message = "I can't order a book and patiently wait for it...";
        assertEquals(expected_message, admin.getMessage());
    }
}