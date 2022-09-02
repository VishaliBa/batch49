//  3.      check if number is even or odd

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int enterNumber = sc.nextInt();
        checkInput(enterNumber);
    }

    public static void checkInput(int enterNumber) {
        if (enterNumber % 2 == 0) {
            System.out.println("The number is even = " + enterNumber);
        } else {
            System.out.println("The number is odd = " + enterNumber);
        }
    }
}
