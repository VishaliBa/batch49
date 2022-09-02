import java.util.Scanner;

public class PracticeWhile {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Guess the number: ");
            int aInt = sc.nextInt();
            if (random == aInt) {
                System.out.println("You win ");
                flag = false;
            } else {
                System.out.println("Try again !!!");
            }
        }
    }
}
// check number btw 1 to 100. if the user is wrong give HINT like your number is
// less than your guess or greater than