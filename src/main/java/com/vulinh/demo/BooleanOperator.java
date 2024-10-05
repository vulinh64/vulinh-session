package com.vulinh.demo;

import java.util.List;

public class BooleanOperator {

    public static void main(String[] args) {
        boolean r1 = 34 <= 50 && 34 >= 16;

        System.out.println(r1);

        boolean r2 = 45 < 12 && 25 >= 14;

        System.out.println(r2);

        boolean r3 = 14 > 25 || 9 >= 3;

        System.out.println(r3);

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        boolean r5 = !list.isEmpty();

        // !true -> false
        // !false -> true

        System.out.println(r5);

        // AND takes precedence over OR
        boolean r6 = 12 < 5 || 15 > 3 && 14 == 14;

        // a = 14 + 25 * 8

        System.out.println(r6);
    }
}
