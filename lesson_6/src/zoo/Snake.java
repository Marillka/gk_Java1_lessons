package zoo;

public class Snake extends Animal {

    public Snake(String name, String color) {
        super(name, color);

//        this.name = name;
//        this.color = color;
    }


    public void voice() {
        System.out.printf("%s Ssssh\n", name);
    }


    public void walk() {
        System.out.printf("%s crawling\n", name);
    }

    public void walkAsParent() {
        super.walk();
    }
}
