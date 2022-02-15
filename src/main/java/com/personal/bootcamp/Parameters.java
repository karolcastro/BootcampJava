package com.personal.bootcamp;

public class Parameters {
    public static void main(String[] args) {
        measureRectangle(5, 4);

    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;

        System.out.println("The area of the rectangle is " + area + "\n");
    }
}
