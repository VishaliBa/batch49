package udemy;//   2. Check if number is positive or negative

import java.util.Scanner;
public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int firstInput = sc.nextInt();
    checkInput(firstInput);
    }

    public static void checkInput(int firstInput) {
        if (firstInput > 0 ){
            System.out.println("The positive output= " +firstInput);
        } else if (firstInput < 0) {
            System.out.println("The Output is negative= " +firstInput);
        }else {
            System.out.println("The number is neither negative or positive");
        }

//
//      print odd number till 100
//
//        for (int i = 1; i <= 100 ; ++i){
//            if (i % 2 ==1 )
//            System.out.println(i);
//        }
//
//
//      print even number till 100
//
//        for (int i = 1; i <= 100 ; ++i) {
//            if (i % 2 == 0)
//                System.out.println(i);
//        }
//
//
//      print all numbers till 1 to 100
//
//        for (int i = 1; i <= 5 ; ++i){
//
//                System.out.println("* * *");
//       }
//
//      print all numbers from 100 to 1
//
//        for (int i = 100; i >= 1 ; i--) {
//            System.out.println(*);
//        }
//
//
//        int product = 1;
//        for (int i = 10 ; i >=1 ; i--){
//            product = product * i;
//            System.out.println(product);
//        }
//        System.out.println(product);

        // 0 1 1 2  3 5 8



        //try fibonacci series
        // try prime numbers
        // factorial numbers 5 ! =  5 *4*3*2*1

    }

}
