package com.personal.bootcamp.section16.workbook.airlineReservationSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[] {
                new Person("Rayan Slim", "Canadian", "01/01/1111", 5, "BRT"),
                new Person("Adam Slim", "Canadian", "02/01/1111", 5, "BRT"),
        };

        Airplane airplane = new Airplane();

        for (int i = 0; i < person.length; i++) {
            airplane.setPerson(person[i]);
        }

        System.out.println(airplane.getPerson(1));
    }
}
