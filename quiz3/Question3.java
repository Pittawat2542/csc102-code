package quiz3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        final int MAX_HOURS = 6;
        final int MAX_MINUTES = 9;

        Scanner scanner = new Scanner(System.in);

        int sixHours = scanner.nextInt();

        int[] hours = new int[MAX_HOURS];
        for (int i = 0; i < MAX_HOURS; i++) {
            hours[i] = scanner.nextInt();
        }

        int[] minutes = new int[MAX_MINUTES];
        for (int i = 0; i < MAX_MINUTES; i++) {
            minutes[i] = scanner.nextInt();
        }

        int tenMinutes = scanner.nextInt();
        int twentyMinutes = scanner.nextInt();
        int thirtyMinutes = scanner.nextInt();

        // Loop to check the hours
        int realHours = 0;
        int count = 0;
        while (count < MAX_HOURS && hours[count] != 0) {
            realHours = ++count;
        }

        realHours += (sixHours * 6);

        // Loop to check the minutes
        int realMinutes = 0;
        count = 0;
        while (count < MAX_MINUTES && minutes[count] != 0) {
            realMinutes = ++count;
        }

        realMinutes += (tenMinutes * 10) + (twentyMinutes * 20) + (thirtyMinutes * 30);

        System.out.println(realHours + ":" + realMinutes);

        scanner.close();
    }
}