package patterns.composite;

public class Client {
    private CompositeServices compositeServices;

    public Client(CompositeServices compositeServices) {
        this.compositeServices = compositeServices;
    }

    public CompositeServices getCompositeServices() {
        return compositeServices;
    }

    public void setCompositeServices(CompositeServices compositeServices) {
        this.compositeServices = compositeServices;
    }
}
