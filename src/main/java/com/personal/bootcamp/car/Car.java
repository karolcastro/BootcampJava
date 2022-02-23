package com.personal.bootcamp.car;

import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor(){
        return this.color;
    }

    public String[] getParts(){
        return this.parts;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void drive() {
        System.out.println("You bought the beautiful " + this.color + " " + this.year + " " + this.make + " for " + this.price +" .");
        System.out.println("Please drive your car to the nearest exit. \n");
    }

    @Override
    public String toString() {
        return "Make = " + make + '\n' +
                "Price = " + price +  '\n' +
                "Year = " + year +  '\n' +
                "Color = " + color + '\n' +
                "Parts = " + Arrays.toString(parts);
    }
}
