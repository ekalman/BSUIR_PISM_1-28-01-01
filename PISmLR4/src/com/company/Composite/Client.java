package com.company.Composite;

public class Client {
    private CompositeService compositeService;

    public Client(CompositeService compositeServices) {
        this.compositeService = compositeServices;
    }

    public Client() {

    }

    public CompositeService getCompositeServices() {
        return compositeService;
    }

    public void setCompositeServices(CompositeService compositeServices) {
        this.compositeService = compositeServices;
    }
}