package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명언) ");
            String input = scanner.nextLine();
            if (input.equals("종료")) {
                break;
            } else if (input.equals("등록")) {
                System.out.print("명언 : ");
                String famousSaying = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
            }
        }
    }
}
