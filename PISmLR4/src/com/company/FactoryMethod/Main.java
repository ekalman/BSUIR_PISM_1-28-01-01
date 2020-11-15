package com.company.FactoryMethod;

class Main {
    public static void main(String[] args) {
        Service customer_service = ServiceFactory.getService("customer", "only customer's rights are available", "no admin rights are available");
        Service admin_service = ServiceFactory.getService("admin", "customer's rights are not available", "all admin rights are available");
        System.out.println("Factory Customer Service description: " + customer_service);
        System.out.println("Factory Admin Service description: " + admin_service);
    }
}