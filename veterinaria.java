package petStore;

public class veterinaria {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.talk());
        Perro perro = new Perro();
        System.out.println(perro.talk());
        Gallo gallo = new Gallo();
        System.out.println(gallo.talk());
    }
}
