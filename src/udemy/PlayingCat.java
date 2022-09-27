package udemy;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));

    }

    public static boolean isCatPlaying (boolean summer, int temperature ){
//        if (summer) {
//            return temperature >= 25 && temperature <= 45;
//        } else {
//            return temperature >= 25 && temperature <= 35;
//        }

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (temperature >= 25 && temperature <= 35) {
        return true;
        } else {
            return false;
        }
    }
}
