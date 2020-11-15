package com.company.FactoryMethod;

public class ServiceFactory {
    public static Service getService(String type, String customer_rights, String admin_rights) {
        if ("customer".equalsIgnoreCase(type)) return new CustomerService(customer_rights, admin_rights);
        else if ("admin".equalsIgnoreCase(type)) return new AdminService(customer_rights, admin_rights);
        return null;
    }
}
