package org.example;


import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please give your password:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (longerThan8(password)){
            if (digit(password)){
                if (upperAndLower(password)){
                    if (!wellknow(password)){
                        if (specialCharacter(password)){
                            System.out.println("Your password has been verified!");
                        } else {
                            System.out.println("Your password must have at least one special character");
                        }
                    } else {
                        System.out.println("Don't use well-known passwords.");
                    }

                } else {
                    System.out.println("Your password must have at least one lower case letter and one upper.");
                }
            } else {
                System.out.println("Your password must have at least one digit.");
            }
        } else {
            System.out.println("Please give a password longer than 7.");
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
}