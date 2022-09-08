package exercise.oops;

public class SecondsAndMinutesChallenge {
    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) && ((seconds < 0) || (seconds < 59))) {
            return "invalid value";
        }
        long hours = minutes/60;
        long  % 3600;

        System.out.println(hours +"Hrs "+ minutes + "Min "  + seconds + "Sec" );
        return "minutes";
    }


}
