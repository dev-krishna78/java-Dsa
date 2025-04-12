package methods;
import java.util.Scanner;
public class passingArguments {

    public static void greet(String name , int age ){
        System.out.println(" hello " + name + " your age is " + age);
    }

    public static int multiply(int a ,int b){
        return (a*b);
    }
    public static int sum(int a ,int b ){
        return (a+b);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number first ");
        int num1 = sc.nextInt();
        System.out.println(" enter number second ");
        int num2 = sc.nextInt();

        greet("krishna ",20);
        System.out.println("sum value is :" + sum(num1,num2));
        System.out.println(" multiply value is " + multiply(num1,num2));

        return;
    }
}
