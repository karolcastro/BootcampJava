package com.personal.bootcamp.challenge;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        System.out.println("Let's play Rock Paper Scissors. ");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors. ");
        System.out.println("Are you ready? Write 'yes' if you are ");

        Scanner scanner = new Scanner(System.in);
        String ready = scanner.nextLine();

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock -- paper -- scissors, shoot!");

            String choice = scanner.nextLine();
            String computerChoice= computerChoice();

            System.out.println("\nYou chose:\t" + choice);
            System.out.println("The computer chose:\t" + computerChoice);

        } else {
            System.out.println("Darn, some other time...!");
        }

        scanner.close();
    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int integer = (int) randomNumber;

        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return " ";
        }
    }
}
