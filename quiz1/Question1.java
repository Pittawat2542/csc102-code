package quiz1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = scanner.nextInt();
        int paidAmount = scanner.nextInt();
        int remainder = Math.abs(paidAmount - totalAmount);

        System.out.println("1000 $ = " + remainder / 1000);
        remainder %= 1000;
        System.out.println("500 $ = " + remainder / 500);
        remainder %= 500;
        System.out.println("100 $ = " + remainder / 100);
        remainder %= 100;
        System.out.println("50 $ = " + remainder / 50);
        remainder %= 50;
        System.out.println("20 $ = " + remainder / 20);
        remainder %= 20;
        System.out.println("10 $ = " + remainder / 10);
        remainder %= 10;
        System.out.println("5 $ = " + remainder / 5);
        remainder %= 5;
        System.out.println("1 $ = " + remainder / 1);

        scanner.close();
    }
}