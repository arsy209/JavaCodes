package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value ==1) {
//            System.out.println("value 1");
//        } else if (value ==2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("value was not 1 or 2");
//        }
//
        int switchValue = 5;

        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3,or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("value was not 1 or 2");
                break;

        }

        // Challenge
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A,B,C,D, or E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found


        char letter = 'A';

        switch(letter) {
            case 'A':
                System.out.println("it was letter A");
                break;

            case 'B':
                System.out.println("it was letter B");
                break;

            case 'C':
                System.out.println("it was letter C");
                break;

            case 'D':
                System.out.println("it was letter D");
                break;

            default:
                System.out.println("not found");
                break;


        }

        String month = "January";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
                break;
        }

    }
}
