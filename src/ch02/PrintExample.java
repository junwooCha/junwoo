package ch02;

import java.awt.*;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();

        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        System.out.printf("%s의 키는 %.1fcm, 나이는 %d세, 혈액형은 %c형이다" ,nm , height, age, bloodType);
        System.out.println();

    }
}
