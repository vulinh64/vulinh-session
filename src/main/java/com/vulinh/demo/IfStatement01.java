package com.vulinh.demo;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number #1: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Number #2: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.println("Num1 is greater than Num2!");
        } else if (num1 == num2) {
            System.out.println("Num1 is equal to Num2!");
        } else {
            System.out.println("Num2 is greater than Num1!");
        }
    }
}
