package patterns.builder;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void makeController(TypeEnum typeEnum) {
        switch (typeEnum){
            case Flight: new BuilderOne(); break;
            case Customer: new BuilderTwo();break;
        }
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }
}
