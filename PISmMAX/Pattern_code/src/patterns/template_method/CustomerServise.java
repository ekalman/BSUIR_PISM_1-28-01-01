package patterns.template_method;

import java.util.List;

public class CustomerServise implements Service {

    List<Object> sortByName(List<Object> objects){
        return objects;
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
