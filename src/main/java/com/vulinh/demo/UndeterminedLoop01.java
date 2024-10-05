package com.vulinh.demo;

public class UndeterminedLoop01 {

    // 1 + 1/(1 + 1) + 1/(1 + 2) + ... <-> 1/(1 + n) < ESP
    public static void main(String[] args) {
        double eps = 1E-6; // 1 * 10^-6

        var sum = 0.0;
        var next = 1.0;
        var add = 1;

        while (next > eps) {
            sum += next;

            next = 1.0 / (1 + add);

            add++;
        }

        System.out.println("Sum: " + sum);
    }
}
