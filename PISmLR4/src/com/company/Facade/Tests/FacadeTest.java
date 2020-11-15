package com.company.Facade.Tests;
import com.company.Facade.Catalog;
import com.company.Facade.CatalogService;
import com.company.Facade.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {
    @Test
    public void testCatalog(){
//        Catalog catalog = new Catalog();
        Customer customer = new Customer();
        assertEquals(Catalog.class, customer.getClass());
    }

    @Test
    public void testCustomer(){
//        Customer customer = new Customer();
        Catalog catalog = new Catalog();
        assertEquals(Customer.class, catalog.getClass());
    }

    @Test
    public void testArrays(){
        CatalogService catalogService = new CatalogService();
//        String[] names = {"A", "B", "...", "Sherlock Holmes"};
//        String author = "Doyle";
        String[] names = {"A", "B", "...", "Sherlock"};
        String author = "not Doyle";
        assertEquals(names[3], catalogService.getNames()[3]);
        assertEquals(author, catalogService.getAuthors()[3]);
    }
}