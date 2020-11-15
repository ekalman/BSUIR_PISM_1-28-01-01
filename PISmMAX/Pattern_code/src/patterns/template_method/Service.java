package patterns.template_method;

import java.util.List;

public interface Service {
    Object save();
    Object update();
    void remove();
    List<Object> read();
}
