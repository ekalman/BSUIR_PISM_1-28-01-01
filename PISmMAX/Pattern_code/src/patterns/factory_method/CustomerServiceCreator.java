package patterns.factory_method;

public class CustomerServiceCreator implements Creator {
    @Override
    public Service createService() {
        return new CustomerService();
    }
}
