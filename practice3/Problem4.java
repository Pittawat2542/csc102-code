package practice3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        int[] sum = new int[row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int n : arr[i]) {
                sum[i] += n;
            }
        }

        boolean magic = true;
        for (int i = 0; i < sum.length - 1; i++) {
            if (sum[i] != sum[i + 1]) {
                magic = false;
            }
        }
        
        System.out.println(magic);
        scanner.close();
    }
}