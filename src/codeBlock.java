//public class codeBlock {
//    public static void main(String[] args)
//    {
//
//       int highScore = calculateScore (true, 800, 5, 100);
//        System.out.println("Final score = " + highScore);
//
//        highScore = calculateScore (true, 10000, 8, 200);
//        System.out.println("Final score = " + highScore);
//    }
//
//    public static int calculateScore (boolean gameOver, int score , int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore =  score + (levelCompleted * bonus);
//                finalScore += 2000;
//
//                return finalScore ;
//
//        } else {
//            System.out.println("Final score = -1");
//            return -1;
//        }
//    }
//}

public class codeBlock {
    public static void main(String[] args) {

        displayHighScorePosition( "paul" ,  2);
        System.out.println( "Managed to get into position : " );


        System.out.println("Calculate high score position " +calculateHighScorePosition( 1500)  );
        System.out.println("Calculate high score position " +calculateHighScorePosition( 900)  );
        System.out.println("Calculate high score position " +calculateHighScorePosition( 400)  );
        System.out.println("Calculate high score position " +calculateHighScorePosition( 50)  );
    }

    public static void displayHighScorePosition(String playerName , int position){

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500){
            return 3 ;
        } else {
            return 4;
        }




    }


}

