package com.vulinh.nvlinh5;

import java.util.Scanner;

public class BT1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số thứ nhất: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào số thứ hai: ");
        int b = Integer.parseInt(scanner.nextLine());

        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int modulo = a % b;

        System.out.println("Tổng của a và b = " + add);
        System.out.println("Hiệu của a - b = " + subtract);
        System.out.println("Tích của a và b = " + multiply);
        System.out.println("Phần nguyên của a / b = " + divide);
        System.out.println("Phần dư của a % b = " + modulo);
        System.out.println("a lớn hơn b: " + (a > b));
        System.out.println("a bé hơn b: " + (a < b));
    }
}
