package com.personal.bootcamp.section16.airlineReservationSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        /*person.name = "Maria";
        person.nationality = "Brasileira";
        person.dateOfBirth = "1/08/1999";
        person.passport = new String[]{person.name, person.nationality};
        person.seatNumber = 4;*/

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);


    }
}
