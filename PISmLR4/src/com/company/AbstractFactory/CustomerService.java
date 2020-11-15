package com.company.AbstractFactory;

public class CustomerService extends ConcreteFactoryCustomer{
    ConcreteFactoryCustomer customer = new ConcreteFactoryCustomer();

    @Override
    public String AccessMessage() {
        return customer.AccessMessage();
    }
}
