import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.security.spec.RSAOtherPrimeInfo;

public class lesson_2 {
   static int classIntVariable = 15; // видно во всем классе
    public static void main(String[] args) { // psvm
//        printSomethingIntoConsole();
//        printArgumentValueIntoConsole("hello");
//        double someNumber = calculateSomeExpression(0.24, 5.25);
//        vendingWithIfs();
//        vendingWithSwitch();
//        vendingWithSwitchModern();
//        WhileExample();
//        doWhitleExample();
//        forLoopExample();
//        forLoopDouble();

//        arraySimpleExample(); // не доделал я

        String[] strings  = {
            "March",
            "April",
            "May",
            "june"
        };
        for (String s : strings) { //iter
            System.out.println(s);
        }
    }

    private static void arraySimpleExample() {
        int[] arr;
        arr = new int[5];
        arr[0] = 10; // CTRL + D
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 110;
        arr[4] = 5;

        arr[1] = (arr[1] + arr[3]) / arr[2];
        System.out.println(arr[1]);

//        System.out.println(arr[5]);
        System.out.println(arr.length);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 4};

        for (int i = 0; i < arr1.length; i++) {
            arr[i] *= 2;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
    }

    private static void forLoopDouble() {
        mySuperPuperCrazyLabel: // label Not recommended

        for (int i = 0; i < 10; i++) {// fori
            System.out.printf("Exercise #%d: ", i);
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " ");
                if (j == 4) {
                    break mySuperPuperCrazyLabel;
                }
            }
            System.out.println();
        }
    }

    private static void forLoopExample() {
        for (int a = 0, b = 10, c = 100; a < 10 && b > 0 && c > 10; a++, b--, c -= 10) {
            System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
        }

        int counter = 1;
        for (;;counter++) {
            System.out.println(counter);
            if (counter > 10) {
                break;
            }
        }
    }

    private static void doWhitleExample() {
        int counter = 1;
        do {
            System.out.println(counter++);
        } while (counter < 0);
    }

    private static void WhileExample() {
        int counter = 1;
//        while (counter < 21) {
//        while (true) {
        while (counter < 0) {
            counter++;
            if (counter % 3 == 0) {
                continue;
            }
            System.out.println(counter);
            if (counter == 10) {
                break;
            }
        }
    }

    public static void vendingWithSwitchModern() {// Java 14++
        var choice = 43; // var - только локальная переменная ( которая в методе), var можно объявить только срзау и инициализацией, следовательно var сам выбирает класс.

        switch (choice) { // идеально для вывода одной строки
            case 1, 43 -> System.out.println("Give Lays");
            case 2 -> System.out.println("Give Cheetos");
            case 3 -> System.out.println("Give Coca Cola");
            case 4 -> {
                System.out.println("Give Pepsi");
                //..... если надо в одном кейсе вывысти несколько строк
            }
            case 5 -> System.out.println("Give Snikers");
            default -> System.out.println("Error. Try again" );
        }
    }

    public static void vendingWithSwitch() {
        int choice = 4;

        switch (choice) {
            case 1:
            case 8:
            case 24:
            case 43:
                System.out.println("Give Lays");
            break;
            case 2:
            System.out.println("Give Cheetos");
            break;
            case 3:
            System.out.println("Give Coca Cola");
            break;
            case 4:
            System.out.println("Give Pepsi");
            break;
            case 5:
            System.out.println("Give Snikers");
            break;
            default:
            System.out.println("Error. Try again" );
        }
    }

    public static void vendingWithIfs() {
        int choice = -10;

        if (choice == 1) {
            System.out.println("Give Lays");
        } else if (choice == 2) {
            System.out.println("Give Cheetos");
        } else if (choice == 3) {
            System.out.println("Give Coca Cola");
        } else if (choice == 4) {
            System.out.println("Give Pepsi");
        } else if (choice == 5) {
            System.out.println("Give Snikers");
        } else {
            System.out.println("Error. Try again" );
        }
    }

    public static void printSomethingIntoConsole() {
        System.out.println("Something");

    }

    public static void printArgumentValueIntoConsole(String word) {
        System.out.printf("Your argument was: %s\n ", word);// souf
    }

    public static double calculateSomeExpression(double firstValue, double secondValue) {
        double result = firstValue / secondValue;
        System.out.println("Calculacting...");// sout
//        System.out.println("firs value: " + firstValue + "; second value: " + secondValue + "; result is: " + result);
//        System.out.printf("First value: %f; second value: %f; result is: %f\n", firstValue, secondValue, result);
        String s = String.format("First value: %.02f; second value: %f; result is: %f\n", firstValue, secondValue, result); // - форматированный вывод
        /*
        * %s - string and universal(можно всунуть любой)
        * %f - integers
        * %f - floats
        * %c - characters
        * %b - boolean
         */
        System.out.print(s);
        return  result;
    }
}
