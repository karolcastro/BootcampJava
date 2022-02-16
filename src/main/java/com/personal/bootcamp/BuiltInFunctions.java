package com.personal.bootcamp;

public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        double sin = Math.sin(1.2);
        System.out.println("The sin of 1.2 is " + sin);

        double power = Math.pow(2, 4);
        System.out.println("The power of power is " + power);

        double random = Math.random();
        System.out.println("The random value is " + random);

        double random2 = Math.random() * 100;
        System.out.println("The random value is " + random2);

        double random3 = Math.random() * 10;
        System.out.println("The random value is " + random3);
    }
}
