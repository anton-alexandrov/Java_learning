public class MyFirstClass {

    public static int Sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int dif(int a, int b) {

        return a-b;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(Sum(a, b));
        System.out.println("Hello World");
    }
}

