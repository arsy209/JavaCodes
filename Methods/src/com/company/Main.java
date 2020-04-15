package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore =  calculateScore(true,800,5,100);
        System.out.println("Your Highscore is " + highScore);

        highScore= calculateScore(true,10000,8,200);
        System.out.println("Your Highscore is " + highScore);

        int highScorePostion = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePostion);

        highScorePostion = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePostion);

        highScorePostion = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePostion);

        highScorePostion = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePostion);

        highScorePostion = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise",highScorePostion);

    }

    public static void displayHighScorePosition(String playerName, int highScorePostion) {
        System.out.println(playerName + " managed to get into positon "
                        + highScorePostion + " on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;
        //below is another way to write the code above.
        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }

    public static int calculateScore(boolean gameOver,int score , int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted  * bonus);
            finalScore+=2000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
