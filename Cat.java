package petStore;

public  class Cat extends Animal
{
    protected Cat() {
        super();
    }

    protected Cat(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    public String talk() {
        return "miau";
    }
}
