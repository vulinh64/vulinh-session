package com.vulinh.demo;

public class Logical1 {

    public static void main(String[] args) {
        boolean r1 = 14 > 26; // false
        System.out.println(r1);

        boolean r2 = 52 % 3 == 0;
        System.out.println(r2);

        boolean r3 = 100 % 50 != 0;
        System.out.println(r3);

        // boolean value = logical expression

        String name = "Thúy";
        String name2 = "Ngọ Anh";

        boolean r4 = name.length() < name2.length();

        System.out.println(r4);

        // comparison: <, >, <=, >=, ==, !=
    }
}
