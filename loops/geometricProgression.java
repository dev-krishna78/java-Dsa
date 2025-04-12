package loops;
import java.util.Scanner;
public class geometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number ");
        int n = sc.nextInt();
        // example of GP - 1,2,4,8,16,32,64,128....nth term!

        int a = 1;
        for(int i =1; i<= n;i++){
            System.out.println(a);
            a*=2;
        }
    }
}
