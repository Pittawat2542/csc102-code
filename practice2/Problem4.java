package practice2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aRow = scanner.nextInt();
        int aColumn = scanner.nextInt();
        int bRow = scanner.nextInt();
        int bColumn = scanner.nextInt();

        if (aColumn == bRow) {
            int[][] a = new int[aRow][aColumn];
            int[][] b = new int[bRow][bColumn];

            // Put data into Matrix a
            for (int i = 0; i < aRow; i++) {
                for (int j = 0; j < aColumn; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            // Put data into Matrix b
            for (int i = 0; i < bRow; i++) {
                for (int j = 0; j < bColumn; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }

            // Matrix operation
            int[][] result = new int[aRow][bColumn];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < aColumn; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Print result
            for (int[] i : result) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
            }

            scanner.close();
        } else {
            System.out.println("Invalid");
        }
    }
}