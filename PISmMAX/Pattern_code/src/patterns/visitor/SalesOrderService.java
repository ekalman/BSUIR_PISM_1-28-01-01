package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderService implements Service {
    @Override
    public void accept(Visitor visitor) {

    }

    public List<Customer> sortByName(){
        return new ArrayList<>();
    }
}
