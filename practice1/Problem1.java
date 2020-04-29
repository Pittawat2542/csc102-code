package practice1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = a;

        for (int i=1; i<=5; i++) {
            int n = a + i;
            if (n % 13 == 0) {
                sum -= n;
            } else {
                sum += n;
            }
        }
        
        System.out.println(sum);

        scanner.close();
    }
}