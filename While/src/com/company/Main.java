package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//	    count = 1;
//	    while (true) {
//	        if (count == 6) {
//	            break;
//            }
//            System.out.println("Count value is " + count);
//	        count++;
//        }
//        count = 1;
//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while ( count != 6);

        //CHALLENGE
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument to the method is
        // an even number or not
        // return true if an even number, otherwise return false;
    }

        public static boolean isEvenNumber(int number) {
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }


        }

}
