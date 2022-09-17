package exercise.oops;
public class SecondsAndMinutesChallenge {
    public static String getDurationString(long minutes, long seconds) { // 65 min, 45 sec
        if (minutes < 0 && (seconds < 0 || seconds < 59)) {
            return "invalid value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes  % 60;
        return hours +"Hrs "+ remainingMinutes + "Min "  + seconds + "Sec";
    }
    public static String getDurationString(long seconds){
        if (seconds < 0){
            return "invalid value";
        }
         long minutes = seconds/60;
         long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
