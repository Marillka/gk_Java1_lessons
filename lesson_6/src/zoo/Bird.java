package zoo;

public class Bird extends Animal {

    public static final String TYPE = "BIRD";

    public Bird(String name, String color) {
        super(name, color);

//        this.name = name;
//        this.color = color;
    }


    public void voice() {
        System.out.printf("%s chik chireek\n", name);
    }

    public void fly() {
        System.out.printf("Bird %s flies\n", name);
    }
}
