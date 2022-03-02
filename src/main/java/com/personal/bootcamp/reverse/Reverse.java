package com.personal.bootcamp.reverse;

public class Reverse {
    public static void main(String[] args) {
        String world = "world", aspas = "";
        char chr;

        for(int i = 0; i < world.length(); i++) {
            chr = world.charAt(i);
            aspas = chr + aspas;
        }
System.out.println("Reversed word: "+ aspas);
        
    }
}
