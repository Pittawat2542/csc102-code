package quiz3;

import java.util.Scanner;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.println(arr[n - 1] + " " + arr[0]);
        scanner.close();
    }
}