package petStore;

public abstract class Animal {
    protected String name;
    protected String type;
    protected int age;

    protected Animal() {
    }

    protected Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public abstract String talk();

}
