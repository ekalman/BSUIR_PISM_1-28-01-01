package patterns.visitor;

public interface Service {
    void accept(Visitor visitor);
}
