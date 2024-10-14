package com.vulinh.methods;

import java.util.Arrays;

public class CommonMethod {

    public static void main(String[] args) {
        // to uppercase
        String name = "linh";
        String uppercase = name.toUpperCase();

        // split into char arrays
        char[] arrays = name.toCharArray();

        System.out.println(uppercase);

        String arr = Arrays.toString(arrays);

        double pow = Math.pow(10, 10);

        System.out.println(arr);

        System.out.println(pow);

        String name2 = "Nguyen Vu Linh";

        String firstName = name2.substring(7);

        System.out.println(firstName);

        String raw = "          Vu Linh      ";

        String trimmed = raw.trim();

        System.out.println("Raw: " + trimmed);

        int[] testArray = new int[]{1, 4, 6, 7, 3, 14, 20};

        int total = sumAll(testArray);
        int totalDivisibleBy3 = sumDivisibleBy3(testArray);

        System.out.println(total);
        System.out.println(totalDivisibleBy3);
    }

    static int sumAll(int[] arrays) {
        int sum = 0;

        for (int i : arrays) {
            sum += i;
        }

        return sum;
    }

    static int sumDivisibleBy3(int[] numbers) {
        int sum = 0;

        for (int i : numbers) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
