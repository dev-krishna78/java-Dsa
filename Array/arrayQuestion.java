package Array;
import java.util.Scanner;
public class arrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" please enter your passing marks ");
        int pass = sc.nextInt();

        int[] marks = {40,46,37,58,48,20,66,89};
        int n = marks.length;

        for(int i =0;i<n;i++) {
            if (marks[i] <= pass) {
                System.out.println(" roll number is " + i + " fail");
            }
            
        }
           System.out.println();


    }
}
