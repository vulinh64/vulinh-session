package com.vulinh;

import java.util.Scanner;

class PrintYourName {

    public static void main(String[] args) {
        // In ra màn hình chữ "Nhập tên bạn: "
        System.out.print("Nhập tên bạn: ");

        // Object hỗ trợ nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Đọc dữ liệu nhập từ bàn phím, kết thúc bằng Enter
        String name = scanner.nextLine();

        // In ra dữ liệu vừa nhập
        System.out.println("Xin chào bạn " + name);
    }
}