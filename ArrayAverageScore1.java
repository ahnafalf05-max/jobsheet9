
import java.util.Scanner;

public class ArrayAverageScore1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        double total = 0;
        int passCount = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + " : ");
            score[i] = sc.nextInt();
            total += score[i];

            if (score[i] > 70) {
                passCount++;
            }
        }

        double average = total / score.length;
        System.out.println("\nThe class average score is = " + average);
        System.out.println("Number of students who passed (>70) = " + passCount);
    }
}
 
    /* 
 
1. Modify the program in Experiment 3 so that the program can display the number of 
students who passed, students who have a score greater than 70 (>70) 
Done
2. 
    







*/
