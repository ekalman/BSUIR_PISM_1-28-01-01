package com.company.Composite;
import java.util.ArrayList;
import java.util.List;

public class CompositeService implements Service {

    private List<Service> services;

    public CompositeService() {
        services = new ArrayList<>();
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void removeService(Service service) {
        services.remove(service);
    }

    @Override
    public void saveObject(Object object) {

    }
}