package com.personal.bootcamp.section16.workbook.airlineReservationSystem;


import java.util.Arrays;

public class Person {
    private String name;
   private String nationality;
   private String dateOfBirth;
   private String[] passport;
   private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber, String passport) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public boolean applyPassport(){
        int number = (int) (Math.random() * 2 );
        if (number == 0) {
            return false;
        } else {
            return true;
        }

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
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public String setName(String jad_slim) {
        return this.name;
    }

    public int seatNumber(int i) {
        return this.seatNumber;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassport() {
        this.passport = new String[] {
                this.name,
                this.nationality,
                this.dateOfBirth,
        };
    }

    public void chooseSeat(){

        this.seatNumber = (int) (Math.random() * 11 + 1);
    }

    @Override
    public String toString() {
        return "Name= " + name + "\n" +
                "Nationality= " + nationality + '\n' +
                "Date Of Birth= " + dateOfBirth + '\n' +
                "Passport=" + Arrays.toString(passport) +  '\n' +
                "SeatNumber= " + seatNumber ;
    }
}
