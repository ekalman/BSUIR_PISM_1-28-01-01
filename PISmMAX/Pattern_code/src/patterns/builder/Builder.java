package patterns.builder;

import patterns.shared.Repository;
import patterns.shared.Service;

public interface Builder {
    void setRepository(Repository repository);
    void setService(Service service);

}
