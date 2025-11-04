
import java.util.Scanner;


public class ArrayNilai1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int[] finalScore = new int[10];

        
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + " : ");
            finalScore[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Final score " + i + " is " + finalScore[i]);

        }

        
    }
}

/* 1. Change the statement in step 5 to be like this 
Run the program. Have there been any changes? How can it be like that? 
Done



*/