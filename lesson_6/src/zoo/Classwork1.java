package zoo;

public class Classwork1 {
    public static void main(String[] args) {
//        simpleExample();
//        simplePolyExample();
//        polyArrayExample();

        Cat cat = new Cat("Barsik", "white");
        Dog dog = new Dog("Bobik", "brown");
        Bird bird = new Bird("Chizhik", "yellow");

        dog.doSomethingStatic();
        System.out.println(bird.TYPE);

        Animal.doSomethingStatic();
        System.out.println(Animal.TYPE);

        Dog.doSomethingStatic();
        System.out.println(Bird.TYPE);

//        Snake s = new Snake("dsd", "dkfj");
//        s.walkAsParent();
    }

    private static void polyArrayExample() {
        Animal[] animals = {
                new Cat("Barsik", "white"),
                new Dog("Bobik", "brown"),
                new Bird("Chizhik", "yellow"),
                new Snake("Kaa", "green"),
                new Parrot("Kesha", "blue")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
            animals[i].voice();

            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).fly();
            }
            if (animals[i] instanceof Parrot p) {
                p.speak();
            }

//            if (i == 2) {
//               Bird b = (Bird) animals[i];
//               b.fly();
//            }
        }
    }


    private static void simplePolyExample() {
        Animal animal1 = new Animal();
//        Cat cat = new Animal)(); // в обратную сторону не работает
        Animal animal2 = new Cat("Murzik","black");
        Object animal3 = new Dog("Tuzik","black");
    }

    private static void simpleExample() {
        Cat cat = new Cat("Barsik", "white");
        Dog dog = new Dog("Bobik", "brown");
        Bird bird = new Bird("Chizhik", "yellow");


        cat.voice();
        cat.walk();

        dog.voice();
        dog.walk();

        bird.voice();
        bird.walk();
    }


}
