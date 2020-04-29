package practice2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 3 == 0 && n % 7 == 0) {
            if (n >= -105 && n <= 105) {
                System.out.println(n);
            } else {
                while (n > 99 || n < -99) {
                    n %= 100;
                }
                System.out.println(n);
            }
        } else if (n % 3 == 0) {
            System.out.println(n - 1);
        } else if (n % 7 == 0) {
            System.out.println(n + 1);
        } else {
            System.out.println(2 * n - 21);
        }

        scanner.close();
    }
}