package zoo;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);

//        this.name = name;
//        this.color = color;
    }


    public void voice() {
        System.out.printf("%s bark\n", name);
    }

    public static void doSomethingStatic() {
        System.out.println("DOGGGGGG");
    }
}
