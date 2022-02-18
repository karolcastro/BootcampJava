package com.personal.bootcamp.section8.workbook42;

public class Waiter {
    public static void main(String[] args) {
        tipTheWaiter(50);

    }

    public static void tipTheWaiter(double bill) {
        double tip = bill *0.15;

        System.out.println("Waiter: I hope you enjoyed your meal!\n");
        System.out.println("Thank you!\n" +
                "Your service was wonderful! Please, accept this tip: $" +tip);
    }
}
