public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }



        // MINOR MISTAKE (WILL RESOLVE LATER)



    public static void printYearsAndDays(long minutes){
    if (minutes < 0){
        System.out.println("Invalid Value");
    } else {
       long hours = minutes / 60;
       long remainingMinutes = minutes % 60;
       long days = hours / 24;
       long remainingDays = hours % 60;
       long years = days    / 365;
       long remainingYears = days % 60;
        System.out.println(+minutes + " min = " + years + " y and " + remainingYears + " d" );
        }
    }
}
