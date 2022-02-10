package com.personal.bootcamp.challenge;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, What is your name? ");
        String name = scan.nextLine();

        System.out.println("Hi " + name +" I´m Javabot. Where are you from?" );
        String place = scan.nextLine();

        System.out.println("I hear it´s beautiful at " + place + "! I´m from a place called Oracle.");

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("So you are " + age + ", cool! I´m 400 years old. This means I´m " + (400 / age) + " times older than you." );
        scan.nextLine();

        System.out.println("Enough about me. What´s your favorite language?" );
        String language = scan.nextLine();

        System.out.println(language + " tha´s great! Nice chatting with you " + name + ". I have to log off now. See ya!" );
    }
}
