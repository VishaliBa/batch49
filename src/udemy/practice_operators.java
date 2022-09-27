package udemy;

public class practice_operators {
    public static void main(String[] args) {
        double valueOne = 20.00;
        double valueTwo = 80.00;
        double resultOne = valueOne + valueTwo * 100.00d;

        double resultTwo = resultOne % 40.00d;
        System.out.println("Remainder = " + resultTwo);
        boolean noRemainder = (resultTwo == 0) ? true : false;
        System.out.println("noRemainder = " + noRemainder);

        if (!noRemainder)
            System.out.println("Got some remainder ");


    }}
