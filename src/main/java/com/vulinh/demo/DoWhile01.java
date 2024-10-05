package com.vulinh.demo;

import java.util.Scanner;

public class DoWhile01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number: ");

            number = Integer.parseInt(scanner.nextLine());

            if (number > 0 && number % 5 == 0) {
                break;
            }

            System.out.println("Number has to be greater than 0 and divisible by 5");
        } while (number < 0 || number % 5 != 0);

        System.out.println("Your number: " + number);
    }
}
