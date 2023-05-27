package petStore;

public class Gallo extends Animal{

    protected Gallo() {
        super();
    }

    protected Gallo(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    public String talk() {
        return "kikiriqui";
    }
}
