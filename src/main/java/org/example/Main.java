package org.example;


import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
        System.out.println("I would like to give you an example of password:");
        System.out.println(PasswordGenerate.generateSecurePassword());

        boolean j = true;
        while (j) {
            System.out.println("Please enter your password in the next line:");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            j = validatePassword(password);
        }


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

    public static boolean wellknow(String p) {
        String[] popularP = {"Password1", "Aa345678"};
        for (String i:popularP){
            if (p.contains(i)){
                return true;
            }
        }
       return false;
    }


    public static boolean specialCharacter(String p) {
        String specialC = "!@#$%^&*()_+{}|:<>?-=[]\\;',./`~";
        for (int i = 0; i < specialC.length(); i++){
            if(p.contains(String.valueOf(specialC.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    public static boolean validatePassword(String password) {
        if (!longerThan8(password)) {
            System.out.println("Please give a password longer than 7.");
            return true;
        }
        if (!digit(password)) {
            System.out.println("Your password must have at least one digit.");
            return true;
        }
        if (!upperAndLower(password)) {
            System.out.println("Your password must have at least one lower case letter and one upper.");
            return true;
        }
        if (wellknow(password)) {
            System.out.println("Don't use well-known passwords.");
            return true;
        }
        if (!specialCharacter(password)) {
            System.out.println("Your password must have at least one special character");
            return true;
        }
        System.out.println("Your password has been verified!");
        return false;
    }

}