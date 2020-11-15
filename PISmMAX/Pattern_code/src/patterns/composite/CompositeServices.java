package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeServices implements Service{

    private List<Service> services;

    public CompositeServices() {
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
