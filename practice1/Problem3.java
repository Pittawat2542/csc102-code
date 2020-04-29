package practice1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int cat = 0;
        int dog = 0;

        for (int i=0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }

        if (cat == dog) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.close();
    }
}