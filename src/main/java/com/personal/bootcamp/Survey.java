package com.personal.bootcamp;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much do you spend on coffee? ");
        double coffePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food? ");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee? ");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions. ");
        System.out.println("Your fast food expenses are $" + (foodPrice/coffePrice) + " times your coffee expenses");
        scan.close();
    }
}
