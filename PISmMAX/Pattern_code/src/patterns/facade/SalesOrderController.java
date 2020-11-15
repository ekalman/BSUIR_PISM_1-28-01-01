package patterns.facade;

public class SalesOrderController {
    private SalesOrderService service;

    public void saveSalesOrder(){
        service.setSalesOrderSessionBean();
        service.updateCustomer(new Object());
        service.updateSalesOrder(new Object());
    }
}
