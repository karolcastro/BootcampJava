package com.personal.bootcamp.challenge.triviaQuiz;

import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the correct answer to each question.\n");

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n" + "\tb) Ireland\n" + "\tc) Brazil\n" + "\td) Italy");
        String answer1 = scan.nextLine();

        System.out.println("2\\. Which planet is the hottest?");
        System.out.println("\ta) Venus\n" + "\tb) Saturn\n" + "\tc) Mercury\n" + "\td) Mars");
        String answer2 = scan.nextLine();

        System.out.println("3\\. What is the rarest blood type?");
        System.out.println("\ta) O\n" + "\tb) A\n" + "\tc) B\n" + "\td) AB-Negative");
        String answer3 = scan.nextLine();

        System.out.println("4\\. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n" + "\tb) Hermione Granger\n" + "\tc) Draco Malfoy");
        String answer4 = scan.nextLine();

        int score = 0;


        if (answer1.equals("c")) {
            score += 5;
        } if (answer2.equals("a")) {
            score += 5;
        } if (answer3.equals("d")) {
            score += 5;
        } if (answer4.equals("a") || answer4.equals("b")) {
            score += 5;
        }

        System.out.println("Your final score is: " + score + "/20");

        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5 && score <= 15) {
            System.out.println("Not Bad!");
        } else {
            System.out.println("Better luck next time");
        }

    }
}
