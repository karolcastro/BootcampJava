package com.personal.bootcamp.section8.scope;

public class Scope {

    static int apples = 5;

    public static void main(String[] args) {
        System.out.println(apples);
        applesMetodo();
    }

    private static void applesMetodo() {
        System.out.println(apples);

    }
}
