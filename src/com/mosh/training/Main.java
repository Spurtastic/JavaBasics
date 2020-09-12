package com.mosh.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//===================String Comparisons=============================================
        String password = "helloHuman";
        System.out.println("Guess passWord: ");
        Scanner input = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(password.equals(guess)); // make sure you use this for string comparisons, because "==" does not work


//===================Class Initialising=============================================
        User user = new User();
        user.name = "Ashwin Sarith";
        user.age  = "24";
        user.lastName = "Salisbury"; //setting a property
        System.out.println(user.getFullName());



//===================STRING METHODS=============================================
        // so for strings you have startsWith and endsWith for boolean responses
        // .length() for the length of the given string or item
        // .indexOf() - to find the index of a string
        // .trim() - for removing whitespaces in strings
        // .replace(this literally just changes for that line as a new string)
        // NOTE: Strings are immutable


    }
}
