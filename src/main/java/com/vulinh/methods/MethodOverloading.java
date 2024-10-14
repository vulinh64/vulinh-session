package com.vulinh.methods;

public class MethodOverloading {

    // int -> float -> double
    public static void main(String[] args) {
        int sum2 = sum(4, 5);

        double sumDouble = sum(1.0, 12F);

        System.out.println(sum2);

        System.out.println(sumDouble);

        printHello(null);

        printHello("Linh");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double sum(int a, double b) {
        return a + b;
    }

    static double sum(double a, int b) {
        return a + b;
    }

    static void printHello(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Please enter your name!");
            return;
        }

        System.out.println("Hello " + name);
    }
}
