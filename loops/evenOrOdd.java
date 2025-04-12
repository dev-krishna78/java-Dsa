package loops;
import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number ");
        int n = sc.nextInt();

        //  for even number int i = 2;

        for(int i =1; i<=n; i+=2){  // odd number print
            System.out.println(i);
        }
    }
}
