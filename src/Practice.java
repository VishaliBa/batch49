public class Practice {
    public static void main(String[] args) {
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = (50000 + 10 * (myByteValue + myShortValue + myIntValue));
        short shortValue = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

        System.out.println("byte value = " + myByteValue);
        System.out.println("short value = " + myShortValue);
        System.out.println("int value = " + myIntValue);
        System.out.println("long value = " + myLongValue);
        System.out.println("Short Value = " + shortValue);


// convert a given number of pound = 0.453592 into kilograms
// STEPS:
//   1. Create a variable with the appropriate type of store the number
//   2. Calculate the result i.e. the number of kilograms based on contents
//           of the variable above and store the result in 2nd appropriate variable.
//   3. Print out the result.


        double onePound = 100;
        double convertedKilograms = 0.453592 * onePound;

        System.out.println("converted into Kilograms = " + convertedKilograms);



    }
}