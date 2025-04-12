package loops;
import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        // find AP using maths formula  //  nth term an = a + (n-1)d
        // a = first term , d = difference

        // example of formula   a,a+d,a+2d......  a+(n-1)d

        for(int i =1 ; i<= 2*n-1; i+=2){
            System.out.print(" "+ i);
        }
        System.out.println();

        System.out.println(" without using formula of nth term");


        // without using formula only logic
        int a = 4, d = 3;
        for( int i = 1; i<=n;i++){
            System.out.print(" "+ a);
            a+= 3;
        }
    }
}
