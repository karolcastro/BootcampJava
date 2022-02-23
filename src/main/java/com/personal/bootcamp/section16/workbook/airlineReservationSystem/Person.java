package com.personal.bootcamp.section16.workbook.airlineReservationSystem;


public class Person {
    private String name;
   private String nationality;
   private String dateOfBirth;
   private String[] passport;
   private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public void applyPassport(){

    }

    public void chooseSeat(){

    }


    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String[] getPassport() {
        return this.passport;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }
}
