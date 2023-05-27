package petStore;

public  class Perro extends Animal
{
    protected Perro() {
        super();
    }

    protected Perro(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    public String talk() {
        return "guau";
    }
}
