package com.company.Facade;

public class Order {
    private String author;
    private String name;
    private int quantity;

    public Order(String author, String name, int quantity) {
        this.author = author;
        this.name = name;
        this.quantity = quantity;
    }
}
