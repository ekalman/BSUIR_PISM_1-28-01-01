package com.company.FactoryMethod;

abstract class Service {

    public abstract String getCustomerService();

    public abstract String getAdminService();

    @Override
    public String toString() {
        return "Customer Rights: " + this.getCustomerService() + ", Admin Rights: " + this.getAdminService();
    }
}
