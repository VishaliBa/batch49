package udemy;

public class CalcFeetAndInchesToCentimeters {
    public static double main(double feet , double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {   // confusion about greater than
            System.out.println("Invalid Feet or Inches parameters");
            return -1;
        }
        double centimeters = (feet * 12)  * 2.54;
        centimeters += inches * 2.54;
       // centimeter = centimeters + inches * 2.54;
        System.out.println(feet + "F, " + inches + "IN, " + centimeters + "CM");
        return centimeters;
    }
    public static double main(double inches) {
        if (inches < 0) {
        return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println("inches is equal to = " + feet + "feet and " + remainingInches + "inches");
        return main(feet, remainingInches);
        }
    }

