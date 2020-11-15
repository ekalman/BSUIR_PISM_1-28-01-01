package patterns.facade;

public class SalesOrderService {
    private SalesOrderRepository salesOrderRepository;
    private CustomerRepository customerRepository;

    public void updateSalesOrder(Object o){
        salesOrderRepository.update(o);
    }

    public void updateCustomer(Object o) {
        customerRepository.update(o);
    }

    public void setSalesOrderSessionBean(){

    }
}
