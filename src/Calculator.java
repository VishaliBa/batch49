

public class Calculator {
    public static void main(String[] args) {

        System.out.println(sum(2,3));

        System.out.println(sub(16,8));

        System.out.println(mul(4,5));

        System.out.println(div(11,2));

    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static float div(int a, int b) {
        return a / b;
    }
}
