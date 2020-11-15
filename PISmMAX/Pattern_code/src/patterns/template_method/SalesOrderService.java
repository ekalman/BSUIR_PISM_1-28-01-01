package patterns.template_method;

import java.util.List;

public class SalesOrderService implements Service {

    public double calculateTotalPrice(double a) {
      return a;
    }

    @Override
    public Object save() {
        return null;
    }

    @Override
    public Object update() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public List<Object> read() {
        return null;
    }
}
