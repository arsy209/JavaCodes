package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver =true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("your score was less then 5000 but greater then 1000");
//        }
//        else if (score < 1000){
//            System.out.println("your score was less then 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }
        if (gameOver) {
            int finalScore = score + (levelCompleted  * bonus);
            finalScore+=1000;
            System.out.println("Your final score is " + finalScore);
        }

        //CHALLENGE
        // print out a second score on the screen
        // score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure the first printout above still displays as well

        score = score + 5000;
        levelCompleted = levelCompleted + 3;
        bonus = bonus + 100;

        if (score == 10000) {
            System.out.println("Your score is 100000");
            if (gameOver){
                int finalScore = score + (levelCompleted  * bonus);
                System.out.println("Your final score is " + finalScore);
            }
        }


    }
}
