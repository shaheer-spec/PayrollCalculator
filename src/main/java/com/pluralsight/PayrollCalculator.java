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

        if (hoursWorked > 40) {
            float overTimeHours = hoursWorked - 40;
            double overTimePayRate = payRate * 1.5;
            double overtimeGrossPay = overTimeHours * overTimePayRate;
            double finalOvertimeGrossPay = overtimeGrossPay + (40 * payRate);
            System.out.println("Name: " + name + "\nGross Pay: $" + finalOvertimeGrossPay);
        } else {
            System.out.println("Name: " + name + "\nGross Pay: $" + grossPay);
        }

    }
}
