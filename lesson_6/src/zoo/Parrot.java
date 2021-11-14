package zoo;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    public void speak() {
        System.out.printf("%s: 'dsfkljkdskjldfs'\n", name);
    }



}
