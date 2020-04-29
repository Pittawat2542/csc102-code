package quiz2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] arr = new Integer[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}