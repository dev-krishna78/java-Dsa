package loops;
import java.util.Scanner;
public class tablePrint {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number you want to print table ");
        int n = sc.nextInt();

        // loop
        for(int i =n;i<=n*10;i+=n){
            if(n%2==0) System.out.println(i);
        }
    }
}
