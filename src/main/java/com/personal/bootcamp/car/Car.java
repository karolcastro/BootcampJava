package com.personal.bootcamp.car;

public class Car {

    String make;
    double price;
    int year;
    String color;

    public Car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
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

    public void setColor(String color){
        this.color = color;
    }

}
