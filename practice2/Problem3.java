package practice2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] correctAnswer = {"A", "B", "A", "D", "C"};
        String[] answer = new String[5];
        
        for (int i = 0; i < 5; i++) {
            answer[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++) {
            if (answer[i].equals(correctAnswer[i])) {
                score++;
            }
        }

        System.out.print(score);
        scanner.close();
        
        // Better way

        /* Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] correctAnswer = {"A", "B", "A", "D", "C"};

        for (int i = 0; i < 5; i++) {
            if (scanner.next().equals(correctAnswer[i])) {
                score++;
            }
        }

        System.out.println(score);
        scanner.close(); */
    }
}