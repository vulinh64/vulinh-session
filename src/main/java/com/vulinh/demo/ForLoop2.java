package com.vulinh.demo;

public class ForLoop2 {

    // nested loop
    // 1 + 1/(1 + 1) + 1/(1 + 2) + ... + 1/(1 + n) (n = 10)
    public static void main(String[] args) {
        double sum = 1.0;

        for (int i = 1; i <= 10; i++) {
            double next = 1.0 / (1 + i);

            sum += next;
        }

        System.out.println("Sum: " + sum);
    }
}
