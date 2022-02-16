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

            String  result = result(choice, computerChoice);
            printResult(choice, computerChoice, result);

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

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if ( yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result = "You win!";
        } else if( computerChoice.equals("rock") && yourChoice.equals("scissors")){
            result = "You lose!";
        } else if( yourChoice.equals("paper") && computerChoice.equals("rock")){
            result = "You win!";
        }else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You win!";
        } else {
            result = "It's a tie! ";
        }

        return result;
    }

    public static void printResult(String choice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + choice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }
}
