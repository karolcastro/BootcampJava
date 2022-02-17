package com.personal.bootcamp.car;

import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {

        String[] parts = {"tires", "Keys"};

        Car nissan = new Car("Nissan", 50000, 2018, "Black", parts );

        System.out.println("The car make is " + nissan.getMake() + ", is worth $" + nissan.getPrice() +
                ". It was build in " + nissan.getYear()+ ". It is " + nissan.getColor() + "\n");

        nissan.setColor("blue");

        System.out.println("The car make is " + nissan.getMake() + ", is worth $" + nissan.getPrice() +
                ". It was build in " + nissan.getYear()+ ". It is " + nissan.getColor() + "\n");

        System.out.println(Arrays.toString(nissan.getParts()));

        System.out.println(nissan);
    }
}
