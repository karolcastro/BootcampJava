package com.personal.bootcamp.workbook34;

import java.util.Scanner;

public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = -6;
        String forecast = "";

        System.out.println(forecast);
        if (temp <= -15 || temp <= -1) {
            System.out.println("The forecast is  FREEZING! Stay home!");
        } else if (temp >= 0 || temp <= 10) {
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. Go outside!");
        }
    }
}
