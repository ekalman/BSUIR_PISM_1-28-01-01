package com.company.FactoryMethod;

public class AdminService extends Service{

    private String customer_rights;
    private String admin_rights;

    public AdminService(String customer_rights, String admin_rights) {
        this.customer_rights = customer_rights;
        this.admin_rights = admin_rights;
    }

    @Override
    public String getCustomerService() {
        return this.customer_rights;
    }

    @Override
    public String getAdminService() {
        return this.admin_rights;
    }
}