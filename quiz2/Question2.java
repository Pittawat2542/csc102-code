package quiz2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double tolerance = scanner.nextDouble();

        double xns = (a + b) / 2;
        double t = (b - a) / 2;

        while (t > tolerance) {
            xns = (a + b) / 2;
            t = (b - a) / 2;

            if (f(a, c1, c2) * f(xns, c1, c2) < 0) {
                b = xns;
            } else {
                a = xns;
            }
        }

        System.out.println(xns);

        scanner.close();

    }

    public static double f(double x, double c1, double c2) {
        return c1 + (c2 * (x - Math.sin(x)));
    }
}