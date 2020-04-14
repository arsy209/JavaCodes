package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("myMinFloatValue = " + myMinFloatValue);
        System.out.println("myMaxFloatValue = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("myMinDoubleValue = " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue = " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f ;
        double myDoubleValue =  5.00 / 3.00 ;

        System.out.println("mymyIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double numberOfPounds = 200d;
        double convertedKilograms =  numberOfPounds * 0.45359237d;
        System.out.println(convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
