package practice3;

import java.util.Scanner;

public class Problem5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] arr = new long[n][n];

        for(int lines=0; lines < n; lines++) {
            for (int i=0; i <= lines; i++) {
                if (i == 0 || lines == i) {
                    arr[lines][i] = 1;
                } else {
                    arr[lines][i] = arr[lines - 1][i - 1] + arr[lines - 1][i];
            }
        }
        }
        
        for(long i : arr[n-1]) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}