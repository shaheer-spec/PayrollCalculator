package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scannerPayRoll = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scannerPayRoll.nextLine();

        System.out.println("Hours worked this week: ");
        float hoursWorked = scannerPayRoll.nextFloat();

        System.out.println("What is your pay rate?");
        float payRate = scannerPayRoll.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.println("Name: " + name + "\nGross Pay: $" + grossPay);
    }
}
