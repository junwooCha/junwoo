package ch04;

import sun.plugin2.main.client.WDonatePrivilege;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0, val = 0;
        do {
            System.out.print("숫자를 입력하세요 (정지:0) : ");
            val = scan.nextInt();
            sum = sum + val;
        } while(val != 0);
        System.out.println("합게 : " + sum);
        }
    }
