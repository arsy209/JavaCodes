package com.company;

public class Main {

    public static void main(String[] args) {
	    String NumberAsString = "2019.124";
        System.out.println("NumberAsString = " + NumberAsString);

        //int number = Integer.parseInt(NumberAsString);
        double number = Double.parseDouble(NumberAsString);
        System.out.println("Number = " + number);
        //will join the number to the string
        NumberAsString += 1;
        //will add it to the int
        number += 1;

        System.out.println("NumberAsString = " + NumberAsString);
        System.out.println("Number = " + number);

    }
}
