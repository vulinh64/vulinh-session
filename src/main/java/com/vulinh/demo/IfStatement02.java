package com.vulinh.demo;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter month: ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter day: ");
        int day = Integer.parseInt(scanner.nextLine());

        if (year < 0) {
            System.out.println("Invalid year!");
        } else if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
        } else {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            int maxDay;

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDay = 30;
            } else if (month == 2) {
                if (isLeapYear) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            } else {
                maxDay = 31;
            }

            if (day > maxDay) {
                System.out.println("Invalid day!");
            } else {
                System.out.println("Valid date!");
            }
        }
    }
}
