package com.personal.bootcamp.workbook35;

public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;
        boolean holiday = false;
        boolean saturday = false;
        boolean sunday = false;

        if (holiday == true) {
            System.out.println("Woohoo, no work");
        } else if (holiday == false && saturday == true || sunday == true) {
            System.out.println("it's the weekend, no work!");
        }else {
            System.out.println("Wake up at 7:00 :(");
        }

    }
}
