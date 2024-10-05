package com.vulinh.nvlinh5;

import java.util.Scanner;

public class BT2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number n (50-100): ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 50 || n > 100) {
            System.out.println("Invalid number");

            return;
        }

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double next = 1.0 / i;

            sum += next;
        }

        System.out.println("Total: " + sum);
    }
}
