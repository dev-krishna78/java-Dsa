package basics;
import java.util.Scanner;
public class basicQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // area of square
        System.out.println("enter the value of radius ");
        int r = sc.nextInt();
        double area = 3.141592 *r *r;
        System.out.println("area of square is with radius "+  area);

        // volume of sphere
        double  volume = (4.0/3.0) * Math.PI *Math.pow(r,3);
        System.out.println("volume of sphere is "+ volume);

        // simple interest
        double  p = 3000;
        double radius = 3.5;
        double  t = 3;

        System.out.println( "simple interest " + (p * radius * t)/ 100 );
    }
}
