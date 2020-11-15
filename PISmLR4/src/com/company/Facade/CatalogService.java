package com.company.Facade;

public class CatalogService {
    String[] names = {"A", "B", "...", "Sherlock Holmes"};
    String[] authors = {"A", "B", "...", "Doyle"};

    public String[] getNames(){
        return this.names;
    }

    public String[] getAuthors(){
        return this.authors;
    }

    public Order makeOrder(){
        Order order = new Order(authors[3], names[3], 1);
        return order;
    }

    public void UpdateCustomerRepository(){
    }
}
