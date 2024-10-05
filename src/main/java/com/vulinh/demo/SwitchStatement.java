package com.vulinh.demo;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter month: ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter day: ");
        int day = Integer.parseInt(scanner.nextLine());

        // month = 4, 6, 9, 11 -> day = 30
        // month = 2 -> day = 29 if leap year else 28
        // default = 31

        if (year < 0) {
            System.out.println("Invalid year!");
        } else if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
        } else if (day < 1) {
            System.out.println("Invalid day!");
        } else {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 31) {
                        System.out.println("Invalid day!");
                    } else {
                        System.out.println("Valid day!");
                    }
                    break;

                case 2: {
                    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

                    if (isLeapYear) {
                        if (day > 29) {
                            System.out.println("Invalid day!");
                        } else {
                            System.out.println("Valid day!");
                        }
                    } else {
                        if (day > 28) {
                            System.out.println("Invalid day!");
                        } else {
                            System.out.println("Valid day!");
                        }
                    }
                }
                break;
                default: {
                    if (day > 31) {
                        System.out.println("Invalid day!");
                    } else {
                        System.out.println("Valid day!");
                    }
                } break;
            }
        }
    }
}
