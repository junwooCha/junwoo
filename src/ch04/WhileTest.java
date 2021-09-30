package ch04;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, val = 0;
        System.out.println("숫자를 입력하세요 (정지:0) : ");
        val = scan.nextInt();
        while (val != 0) {
            sum = sum + val;
            System.out.println("숫자를 입력하세요 (정지:0) : ");
            val = scan.nextInt();
            sum = sum + val;
        }
        System.out.println("합계 : " + sum);
    }
}
