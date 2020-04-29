package practice2;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double result = (Math.pow(b, 2) + Math.pow(4 * a, 2) + a - (2 * c)) / (2 * a);
        System.out.println(result);
        scanner.close();
    }
}