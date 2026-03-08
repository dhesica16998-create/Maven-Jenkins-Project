package com.dhesica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Deposit Amount: ");
        int deposit = sc.nextInt();

        System.out.print("Enter Withdraw Amount: ");
        int withdraw = sc.nextInt();

        int balance = deposit - withdraw;

        System.out.println("Account Name: " + name);
        System.out.println("Balance Amount: " + balance);
    }
}