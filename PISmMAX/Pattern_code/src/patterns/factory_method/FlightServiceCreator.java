package patterns.factory_method;

public class FlightServiceCreator implements Creator {
    @Override
    public Service createService() {
        return new FlightService();
    }
}
