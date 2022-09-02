import java.util.Scanner;

public class PracticeArray {
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      // create n array (use scanner) you have to find total marks OF THE STUDENTS
      //    Syntax
        // int[] arr = {1,2,3};
        //int[] arr1= new int[5];



        int[] arr2= new int[]{1,2,4,4};
         for(int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextInt();
        }

         main2(arr2);
    }


    public static void main2(int [] arr3) {

        int sum = 0;
        for (int i = 0;  i<arr3.length; i++) {

            sum = sum + arr3[i];
        }
        System.out.println(sum);
    }
}