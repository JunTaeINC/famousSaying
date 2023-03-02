package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<명언모음집> 명언집 = new ArrayList<>();
        int count = 1;
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
                System.out.printf("%d번 명언이 등록되었습니다.\n", count);
                명언집.add(new 명언모음집(count, famousSaying, author));
                count++;
            } else if (input.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n----------------------");
                for (명언모음집 명언 : 명언집) {
                    System.out.printf("%d / %s / %s\n", 명언.getId(), 명언.get작가(), 명언.get명언());
                }
            }
        }
    }
}

class 명언모음집 {
    int id;
    String 명언;
    String 작가;

    public 명언모음집(int id, String 명언, String 작가) {
        this.id = id;
        this.명언 = 명언;
        this.작가 = 작가;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get명언() {
        return 명언;
    }

    public void set명언(String 명언) {
        this.명언 = 명언;
    }

    public String get작가() {
        return 작가;
    }

    public void set작가(String 작가) {
        this.작가 = 작가;
    }
}
