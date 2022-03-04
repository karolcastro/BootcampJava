package com.personal.bootcamp.section16.workbook.airlineReservationSystem;

public class Airplane {

    Person[] seats;

    public void createReservations(){

    }

    public  Airplane() {
        this.seats = new Person[11];
    }

    public Person getPerson(int index) {

        return new Person(this.seats[index]);
    }

    public void setPerson(Person person) {
        this.seats[person.getSeatNumber() - 1] = new Person(person);

    }

}
