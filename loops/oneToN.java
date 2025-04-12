package loops;
import java.util.Scanner;
public class oneToN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("with number you want to print from 1 ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }

    }
}
