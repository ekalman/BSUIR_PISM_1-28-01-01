package patterns.builder;

import patterns.shared.Controller;
import patterns.shared.Repository;
import patterns.shared.Service;

public class BuilderOne implements Builder {

    private Controller controller;

    public BuilderOne() {
        controller = new Controller();
    }

    @Override
    public void setRepository(Repository repository) {
        controller.setRepository(repository);
    }

    @Override
    public void setService(Service service) {
        controller.setService(service);
    }

    public Controller getResult() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
