package com.company.AbstractFactory;

class Main {
    public static void main(String[] args) {
        CustomerService customer = new CustomerService();
        ConcreteFactoryAdmin admin = new ConcreteFactoryAdmin();

        System.out.println("Customer description: \n" + customer.AccessMessage());
        System.out.println("Admin description: \n" + admin.AccessMessage());
    }
}
