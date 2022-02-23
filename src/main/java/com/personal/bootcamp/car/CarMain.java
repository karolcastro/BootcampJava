package com.personal.bootcamp.car;

import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {

        String[] parts = {"tires", "Keys"};

        Car nissan = new Car("Nissan", 50000, 2018, "Black", parts );
        Car dodger = new Car("Dodger", 80000, 2020, "Blue", parts);

        nissan.setColor("blue");

        nissan.drive();
        dodger.drive();
    }
}
