// 1.  find the largest of three numbers using if..else..if

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int firstLargeNumber = sc.nextInt();
        int secondLargeNumber = sc.nextInt();
        int thirdLargeNumber = sc.nextInt();
        largestNumber(firstLargeNumber, secondLargeNumber, thirdLargeNumber);
    }

    public static void largestNumber(int firstLargeNumber, int secondLargeNumber, int thirdLargeNumber) {

        if (firstLargeNumber > secondLargeNumber && firstLargeNumber > thirdLargeNumber) {
            System.out.println("Largest Number = " + firstLargeNumber);

        } else if (secondLargeNumber > firstLargeNumber && secondLargeNumber > thirdLargeNumber) {
            System.out.println("Largest Number = " + secondLargeNumber);
        } else if (thirdLargeNumber > firstLargeNumber && thirdLargeNumber > secondLargeNumber) {
            System.out.println("Largest Number = " + thirdLargeNumber);
        }else
            System.out.println("All numbers are equal");
    }
}



