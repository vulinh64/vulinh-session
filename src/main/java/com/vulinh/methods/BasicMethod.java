package com.vulinh.methods;

public class BasicMethod {

    // Hàm:
    // 1. Return value (void (nothing), other)
    // 2. Name
    // 3. Parameter signature

    public static void main(String[] args) {
        int sum = add(15, 45);

        System.out.println(sum);

        String concat = concat("Thuy", "Anh", ",");

        System.out.println(concat);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static String concat(String a, String b, String delimiter) {
        return a + delimiter + b;
    }
}
