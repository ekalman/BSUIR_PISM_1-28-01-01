package com.company.Template.Tests;

import com.company.Template.Admin;
import com.company.Template.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateTests {
     @Test
    public void testCustomer(){
        Customer customer = new Customer();
//        assertEquals(2+9, customer.calculateTimeOnPlatform(2,9));
//        assertEquals(1 * Math.max(2, 3), customer.calculateActivity(1,2,3));
         assertEquals(2+8, customer.calculateTimeOnPlatform(2,9));
         assertEquals(1 * Math.max(1, 3), customer.calculateActivity(1,2,3));
    }

    @Test
    public void testAdmin(){
        Admin admin = new Admin();
//        assertEquals((int)Math.pow(7, 2) + 1, admin.calculateTimeOnPlatform(7,1));
//        assertEquals(2 * Math.min(2, 2), admin.calculateActivity(2,2,2));
        assertEquals((int)Math.pow(8, 2) + 1, admin.calculateTimeOnPlatform(7,1));
        assertEquals(2 * Math.min(3, 2), admin.calculateActivity(2,2,2));
    }
}