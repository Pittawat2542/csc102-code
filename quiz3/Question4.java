package quiz3;

import java.util.Scanner;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] sortedArr = new int[n];
        
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);

        String decryptedStr = "";

        for (int i : sortedArr) {
            int key = linearSearch(arr, i);
            decryptedStr += str.charAt(key);
        }

        System.out.println(decryptedStr);

        scanner.close();
    }

    private static int linearSearch(int[] arr, int n) {
        int index = -1;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
        }
        return index;
    }
}