package com.vulinh.demo;

import java.util.Scanner;

public class EnumTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's weather: ");
        Weather weather = Weather.valueOf(scanner.nextLine().toUpperCase());

        switch (weather) {
            case SUNNY:
                System.out.println("Go out and have fun");
                break;
            case SNOWY:
                System.out.println("Go out and play snow fight");
                break;
            default:
                System.out.println("Stay at home");
                break;
        }
    }
}
