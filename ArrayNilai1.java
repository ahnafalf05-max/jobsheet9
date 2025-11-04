import java.util.Scanner;

public class ArrayNilai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] finalScore = new int[10];

        
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score for student " + (i + 1) + ": ");
            finalScore[i] = sc.nextInt();
        }

        System.out.println("\nStudents who passed (score > 70):");

        
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + (i + 1) + " passed with score: " + finalScore[i]);
            }
        }

        sc.close();
    }
}


/* 
1. Change the statement in step 5 to be like this 
Run the program. Have there been any changes? How can it be like that? 
Done
2. Apa yang dimaksud dengan kondisi i < finalScore.length?
 is the total number of elements in the array finalScore
3. Change the statement in step 6 to be like this, so that the program only displays the 
grades of students who passed, students who have a score > 70



*/