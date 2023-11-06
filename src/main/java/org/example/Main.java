package org.example;


import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

    }

    public static boolean longerThan8(String p) {
        return p.length() >= 8;
    }

    public static boolean digit(String p) {
        for (int i=0; i<p.length(); i++){
            if(Character.isDigit(p.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean upperAndLower(String p) {
        for(int i = 0; i < p.length(); i++)
        {
            if (Character.isUpperCase(p.charAt(i))&&Character.isUpperCase(p.charAt(i))){
                return true;
        }
        }
        return false;
    }

    public static boolean oldPopular(String p) {
        String[] popularP = {"Password1", "Aa345678"};
        for (String i:popularP){
            if (p.contains(i)){
                return true;
            }
        }
       return false;
    }


}