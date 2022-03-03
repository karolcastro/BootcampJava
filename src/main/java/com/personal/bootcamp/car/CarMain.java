package com.personal.bootcamp.car;

public class CarMain {
    public static void main(String[] args) {

        Car[] cars = new Car[] {
                new Car("Nissan", 50000, 2018, "Black", new String[]{"tires", "Keys"} ),
                new Car("Dodger", 80000, 2020, "Blue", new String[]{"tires", "Keys"}),
        };

       Dealership dealership = new Dealership();

       for (int i = 0; i < cars.length; i++) {
           dealership.setCar(cars[i], i );
       }

       Car newCar = dealership.getCar(0);
       System.out.println(newCar);
    }
}
