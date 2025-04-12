package basics;
import java.util.Scanner;
public class operator {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print(" enter first value :");
        int a = sc.nextInt();
        System.out.print(" enter second  value :");
        int b = sc.nextInt();

        // mathematical operator
        System.out.println("addition of a and b is :" + (a+b));
        System.out.println("subtraction of a and b :" + (a-b));
        System.out.println("multiplication of a and b :" + (a*b));
        System.out.println("division of a and b :" + (a/b));
        System.out.println("modulo of a and b  :" + (a%b));

        // relation operator
        System.out.println( " a is less than b " + (a<b));
        System.out.println( " a is greater than b " + (a>b));
        System.out.println( " a is less than equal to b " + (a<=b));
        System.out.println( " a is greater than equal to b " + (a>=b));
        System.out.println( " a is not equal to b " + (a!=b));

    }
}
