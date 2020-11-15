package com.company.AbstractFactory;

public class AdminService extends ConcreteFactoryAdmin{
    ConcreteFactoryAdmin admin = new ConcreteFactoryAdmin();

    @Override
    public String AccessMessage() {
        return admin.AccessMessage();
    }
}
