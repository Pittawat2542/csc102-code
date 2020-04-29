package practice1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int checkSize = scanner.nextInt();

        int[] arr = new int[arrSize];
        int[] check = new int[checkSize];

        for (int i=0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i=0; i < checkSize; i++) {
            check[i] = scanner.nextInt();
        }

        for (int i=0; i < checkSize; i++) {
            boolean found = false;
            
            for (int j = 0; j < arrSize; j++) {
                if (check[i] == arr[j]) {
                    System.out.println(check[i] + " is found");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(check[i] + " is not found");
            }
        }

        scanner.close();
    }
}