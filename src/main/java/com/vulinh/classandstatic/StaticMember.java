package com.vulinh.classandstatic;

import com.vulinh.Utils;

import java.util.Scanner;

public class StaticMember {

    // malleable
    /*static Scanner sc = new Scanner(System.in);*/

    // constant
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a = enterNumber();

        double b = enterNumberDouble();

        System.out.println(a);
        System.out.println(b);
    }

    static int enterNumber() {
        int number;

        while (true) {
            System.out.print("Enter number: ");

            number = Integer.parseInt(SCANNER.nextLine());

            if (number < Utils.THRESHOLD) {
                Utils.warning();
            } else {
                return number;
            }
        }
    }

    static double enterNumberDouble() {
        double number;

        while (true) {
            System.out.print("Enter number (double): ");

            number = Double.parseDouble(SCANNER.nextLine());

            if (number < Utils.THRESHOLD) {
                Utils.warning();
            } else {
                return number;
            }
        }
    }
}
