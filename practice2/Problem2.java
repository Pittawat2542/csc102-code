package practice2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aSize = scanner.nextInt();
        int bSize = scanner.nextInt();

        int[] a = new int[aSize];
        int[] b = new int[bSize];

        for (int i = 0; i < aSize; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < bSize; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = new int[aSize + bSize];
        for (int i = 0; i < aSize; i++) {
            result[i] = a[i];
        }
        for (int i = aSize; i < result.length; i++) {
            result[i] = b[i - aSize];
        }
        
        for (int n : result) {
            System.out.print(n + " ");
        }

        scanner.close();

        // Better way

        /* Scanner scanner = new Scanner(System.in);
        int aSize = scanner.nextInt();
        int bSize = scanner.nextInt();
        int[] result = new int[aSize + bSize];
​
        for (int i = 0; i < aSize; i++) {
            result[i] = scanner.nextInt();
        }
        for (int i = aSize; i < result.length; i++) {
            result[i] = scanner.nextInt();
        }
        
        for (int n : result) {
            System.out.print(n + " ");
        }
        scanner.close(); */
    }
}