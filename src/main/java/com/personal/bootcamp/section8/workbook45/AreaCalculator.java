package com.personal.bootcamp.section8.workbook45;

public class AreaCalculator {

    public static void main(String[] args) {

        double square = areaSquare(2);
        double rectangle = areaRectangle(2, 4);
        double triangle = areaTriangle(2, 6);
        double circle = areaCircle(6);

        printAreas(square, rectangle, triangle, circle);

    }

    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Error: impossible\" and terminates the java program.");
        }
        return Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width) {
        double area = length * width;
        if (length < 0 || width < 0) {
            System.out.println("Error: impossible\" and terminates the java program.");
        }
        return area;
    }

    public static double areaTriangle(double height, double base) {
        double area = base * height / 2;

        if (base < 0 || height < 0) {
            System.out.println("Error: impossible\" and terminates the java program.");
        }
        return area;
    }

    public static double areaCircle(double radius) {

        double radius2 = Math.PI * Math.pow(radius, 2);

        if (radius < 0) {
            System.out.println("Error: impossible\" and terminates the java program.");
        }
        return radius2;
    }

    public static void printAreas(double square, double rectangle, double triangle, double circle) {

        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }
}


