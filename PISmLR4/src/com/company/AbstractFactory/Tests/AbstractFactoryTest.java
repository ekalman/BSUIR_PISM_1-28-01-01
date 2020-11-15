package com.company.AbstractFactory.Tests;

import com.company.AbstractFactory.AdminService;
import com.company.AbstractFactory.ConcreteFactoryAdmin;
import com.company.AbstractFactory.ConcreteFactoryCustomer;
import com.company.AbstractFactory.CustomerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void customerAccessMessage() {
//        ConcreteFactoryCustomer concreteFactoryCustomer = new ConcreteFactoryCustomer();
        ConcreteFactoryAdmin concreteFactoryAdmin = new ConcreteFactoryAdmin();
        CustomerService customerService = new CustomerService();
//        assertEquals(concreteFactoryCustomer.AccessMessage(), customerService.AccessMessage());
        assertEquals(concreteFactoryAdmin.AccessMessage(), customerService.AccessMessage());
    }

    @Test
    void adminAccessMessage() {
//        ConcreteFactoryAdmin concreteFactoryAdmin = new ConcreteFactoryAdmin();
        ConcreteFactoryCustomer concreteFactoryCustomer = new ConcreteFactoryCustomer();
        AdminService adminService = new AdminService();
//        assertEquals(concreteFactoryAdmin.AccessMessage(), adminService.AccessMessage());
        assertEquals(concreteFactoryCustomer.AccessMessage(), adminService.AccessMessage());
    }
}