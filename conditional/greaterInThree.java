package conditional;
import java.util.Scanner;
public class greaterInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number ");
        int a = sc.nextInt();
        System.out.println(" enter second number ");
        int b = sc.nextInt();
        System.out.println(" enter third number ");
        int c = sc.nextInt();

       if(a>b){
           if(a>c) System.out.println(" a is greater " + a );
           else if(a == c) System.out.println(" a and c are greater" + a  +" " + c);
           else System.out.println("c is greater ");
       }
        else if(b>a){
            if(b>c) System.out.println(" b is greater " + b);
            else if(b == c) System.out.println(" b and c  are greater" + b + " "+ c );
            else System.out.println("c  is greater ");
        }
        else{ // a == b
            if(c>b) System.out.println(" c is greater " + c );
            else if(c == b) System.out.println(" all are equal ");
            else System.out.println("c  is greater ");
        }


    }

}
