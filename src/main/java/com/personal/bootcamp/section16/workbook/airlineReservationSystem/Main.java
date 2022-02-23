package com.personal.bootcamp.section16.workbook.airlineReservationSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        Person person2 = new Person("Jad Slim", "Canadian", "01/01/1111", 3);

        /*person.name = "Maria";
        person.nationality = "Brasileira";
        person.dateOfBirth = "1/08/1999";
        person.passport = new String[]{person.name, person.nationality};
        person.seatNumber = 4;*/

        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getDateOfBirth());
        System.out.println(Arrays.toString(person.getPassport()));
        System.out.println(person.getSeatNumber());

        System.out.println();
        System.out.println("Name: " + person2.getName()+"\n" + "Nationality: " +person2.getNationality() + "\n" + "Date of Birth: " +person2.getDateOfBirth() + "\n" +
                 "Seat Number: " + person2.getSeatNumber() + "\n");


    }
}
