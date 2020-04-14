package com.company;

public class Main {

    public static void main(String[] args) {
        byte myNum = 10;
        short MyShort = 20;
        int newVal = 50;
        long newLong = 50000L + 10L * (myNum + MyShort + newVal);

        System.out.println(newLong);
        short shortTotal = (short) (1000 + 10  *
                (myNum + MyShort + newVal));
    }
}
