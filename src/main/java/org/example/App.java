package org.example;

import org.example.famousSaying.entity.FamousSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        List<FamousSaying> 명언집 = new ArrayList<>();
        int count = 1;
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String input = scanner.nextLine().trim();
            if (input.equals("종료")) {
                break;
            } else if (input.equals("등록")) {
                System.out.print("명언 : ");
                String famousSaying = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                System.out.printf("%d번 명언이 등록되었습니다.\n", count);
                명언집.add(new FamousSaying(count, famousSaying, author));
                count++;
            } else if (input.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n----------------------");
                for (FamousSaying 명언 : 명언집) {
                    System.out.printf("%d / %s / %s\n", 명언.getId(), 명언.getAuthor(), 명언.getFamousSaying());
                }
            } else if (input.contains("삭제?id=")) {
                int idNumber = Integer.parseInt(input.substring(6));
                if(명언집.size() > 1) {
                    for (FamousSaying 명언 : 명언집) {
                        if (명언.getId() == idNumber) {
                            System.out.printf("%d번 명언이 삭제되었습니다.\n", idNumber);
                            명언집.remove(명언);
                        } else {
                            System.out.printf("%d번 명언은 존재하지 않습니다.\n", idNumber);
                        }
                    }
                } else {
                    System.out.printf("%d번 명언이 삭제되었습니다.\n", idNumber);
                    명언집.clear();
                }
            } else if (input.contains("수정?id=")) {
                int idNumber = Integer.parseInt(input.substring(6));
                for (FamousSaying 명언 : 명언집) {
                    if (명언.getId() == idNumber) {
                        System.out.printf("명언(기존) : %s\n", 명언.getFamousSaying());
                        System.out.print("명언 : ");
                        String modifyFamousSaying = scanner.nextLine();
                        System.out.printf("작가(기존) : %s\n", 명언.getAuthor());
                        System.out.print("작가 : ");
                        String modifyAuthor = scanner.nextLine();
                        명언.setFamousSaying(modifyFamousSaying);
                        명언.setAuthor(modifyAuthor);
                    } else {
                        System.out.printf("%d번 명언은 존재하지 않습니다.\n", idNumber);
                    }
                }
            }
        }
    }
}
