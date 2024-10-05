package com.vulinh.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(sc.nextLine());

        // immutable array size
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + "th element: ");
            arr[i] = Double.parseDouble(sc.nextLine());
        }

        // Arrays.toString -> print array in form of raw array display [...]
        System.out.println("The array is: " + Arrays.toString(arr));

        System.out.println("Element 5th is " + arr[4]);

        for (int i = 0; i < size; i++) {
            System.out.println("#" + i + " = " + arr[i]);
        }

        for (double i : arr) {
            System.out.println(i);
        }
    }
}
