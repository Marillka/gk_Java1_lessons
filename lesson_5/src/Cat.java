import java.time.Year;

public class Cat {
    public static String type = "CAT";
    private String name;
    private String color;
    private int birthYear;


    private Cat() {
        System.out.println("The new cat born!!!");
    }

    private Cat(String color) {
        this();
        this.color = color;
    }

    public static void soSomethingStatic(Cat someCat) {
        System.out.println("Static");
//        color = "ldksj";
        System.out.println(someCat.birthYear);
    }

    public Cat(String name, String color, int age) {
        this(color);
        this.name = name;
        this.birthYear = Year.now().getValue() - age;
    }

    void run() {
        System.out.printf("%s %s-colored run\n", this.name, this.color);
    }

    void voice() {
        System.out.printf("%s %s-colored meaww\n", this.name, this.color);
    }

    @Override
    public String toString() {
        return String.format("Cat %s color: %s age: %d", name, color, getAge() );
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public String getName() {
        return name;// можно без this, разночтений не получится, потому что параметров в методе нет.
    }

    public String getColor() {
        return color;
    }
}


