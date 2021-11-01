import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class lesson_3 {

//    static int a;// int, long, short, byte - 0
//    static double d;// double, float - 0.0
//    static char c; // 'u\0000'
//    static boolean b;// false
//    static String s; // null

    public static void main(String... args) {// вар арг изучить в интернете
//        linearArr();
//        arrays2d();
//        arrayUtilsExample();
//        randomExample();
//        castExample();
//        simpleScannerExample();

        File file = new File("files1/file.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void simpleScannerExample() {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        String s = scanner.nextLine();


//        scanner.useDelimiter("__");// разделаялка, считает до этой __
//        String s = scanner.next();
//
//        System.out.println(s);

//        int a = scanner.nextInt();
//        System.out.println(a);

        scanner.useLocale(Locale.UK);

        double d = scanner.nextDouble();
        System.out.println(d);
    }

    private static void castExample() {
        byte b = 120; // неявное приведение типов
        short s = b;
        int i = s;
//        long l = i;
        long l = 250;

        b = (byte) l;// явное приведение типов (cast)
        System.out.println(b);
    }

    private static void randomExample() {
        int[] arr = MyArrayUtil.makeArrayWithRandomValues(15);
        MyArrayUtil.printArray(arr);


        Random rand = new Random();

//        int q = rand.nextInt(100);
//        int q = rand.nextInt(1001) + 1000;
        int q = rand.nextInt(200) - 100;
        System.out.println(q);

        double doubleVar = rand.nextDouble();
        System.out.println(doubleVar);
        int intFromDouble = (int) (doubleVar * 100);
        System.out.println(intFromDouble);
        Math.random();
    }

    private static void arrayUtilsExample() {
        String[] arr = {
                "January",
                "February",
                "March",
                "April",
                "June"
        };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    private static void arrays2d() {
        //        linearArr();
//        int q;

        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[30];
        arr[2] = new int[10];

        arr[1][15] = 99;

        MyArrayUtil.printArray(arr);
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println(s);

//        System.out.println(q);

        int[][] arr2 = {
                {1,2,3},
                {3,4,5,45,5,45,245,25},
                {6,7,8},
        };
        MyArrayUtil.printArray(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
    }

    private static void linearArr() {
        int[] arr = {1,2,3,4,5,6,7};
        double[] arr1 = {1,2,3,4,5,6,7};
        String[] arr2 = {"1","2","3","4","5","6","7"};

//        System.out.println(arr);
//        System.out.println(arr1);
//        System.out.println(arr2);


        MyArrayUtil.printArray(arr);
        MyArrayUtil.printArray(arr1);
        MyArrayUtil.printArray();
        MyArrayUtil.printArray(1.0,2,3.0,4,5,6);// если есть один дабл то все преобразуется в дабл
    }

}
