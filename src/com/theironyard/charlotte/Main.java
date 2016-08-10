package com.theironyard.charlotte;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static HashMap<String, Double> loyaltyCustomer = new HashMap<>();



    public static void main(String[] args) {


        loyaltyCustomer.put("Joanna", 13.45);
        loyaltyCustomer.put("Hosea", 100.75);
        loyaltyCustomer.put("Hope", 90.23);
        loyaltyCustomer.put("LizAnne", 1.00);


        System.out.println("Welcome to Life Community Bank!");
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        // If the user exists...
        if (loyaltyCustomer.containsKey(name)) {

            //*welcomes*
            System.out.println("Welcome back! " + name);
            System.out.println("What would you like to do today? " +
                    "[1] Check my balance" +
                    "[2] Withdraw Funds" +
                    "[3] Cancel] ");




            // *If the user doesn't exist in system...*
        } else {
            loyaltyCustomer.containsKey(name);

            System.out.println("Looks like you are not in our system. Would you like to create an account? [y/n]");


        }
//user creates account
        String createAccount = scanner.next();

        if (createAccount.equalsIgnoreCase("y")) {
            loyaltyCustomer.put(createAccount, 5.00);
            System.out.println("Ok! Welcome, " + createAccount + "!");
            System.out.println("What would you like to do now? " +
                    "[1] Check my balance" +
                    "[2] Withdraw Funds" +
                    "[3] Cancel " +
                    "[4] Remove account");
//user leaves
        } else if (createAccount.equalsIgnoreCase("n"))
            System.out.println("Ok. Thanks for the brief visit!");
        {

        }

        // If the username is empty...
        if (name.length() == 0) {
            System.err.println("Hey friend, we actually need your name to proceed.");
            name = scanner.next();
            System.out.println("Looks like you are not in our system. Would you like to create an account? [y/n]");
        }


    }
}







