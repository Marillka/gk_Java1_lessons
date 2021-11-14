package zoo;

public class Cat extends Animal {
//    private String name;

    public Cat(String name, String color) {
        super(name, color);


    }


    public void voice() {
        System.out.printf("%s meow\n", name);
    }
}
