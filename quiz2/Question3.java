package quiz2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get n
        int n = scanner.nextInt();

        // Create rubik
        // false = Black, true = White
        boolean[][][] rubik = new boolean[5][5][5];

        // Toggle each time
        for (int i = 0; i < n; i++) {

            // Get position
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            // Toggle phase
            rubik[x][y][z] = !rubik[x][y][z];
            // Other six
            if (x - 1 >= 0) {
                rubik[x - 1][y][z] = !rubik[x - 1][y][z];
            }
            if (x + 1 < rubik.length) {
                rubik[x + 1][y][z] = !rubik[x + 1][y][z];
            }
            if (y - 1 >= 0) {
                rubik[x][y - 1][z] = !rubik[x][y - 1][z];
            }
            if (y + 1 < rubik.length) {
                rubik[x][y + 1][z] = !rubik[x][y + 1][z];
            }
            if (z - 1 >= 0) {
                rubik[x][y][z - 1] = !rubik[x][y][z - 1];
            }
            if (z + 1 < rubik.length) {
                rubik[x][y][z + 1] = !rubik[x][y][z + 1];
            }
        }

        // Initialize count
        int count = 0;

        // Count white
        for (int i = 0; i < rubik.length; i++) {
            for (int j = 0; j < rubik[i].length; j++) {
                for (int k = 0; k < rubik[i][j].length; k++) {
                    if (rubik[i][j][k]) {
                        count++;
                    }
                }
            }
        }

        // Print
        System.out.println(count);

        scanner.close();
    }
}