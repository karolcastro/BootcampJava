package com.personal.bootcamp.car;

public class CarMain {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 50000, 2018, "Black");

        System.out.println("The car make is " + nissan.getMake() + ", is worth $" + nissan.getPrice() +
                ". It was build in " + nissan.getYear()+ ". It is " + nissan.getColor() + "\n");

        nissan.setColor("blue");

        System.out.println("The car make is " + nissan.getMake() + ", is worth $" + nissan.getPrice() +
                ". It was build in " + nissan.getYear()+ ". It is " + nissan.getColor() + "\n");
    }
}
