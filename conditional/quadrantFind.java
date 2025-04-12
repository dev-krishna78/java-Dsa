package conditional;
import java.util.Scanner;
public class quadrantFind {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x:");
        int x = sc.nextInt();
        System.out.println("enter value of y:");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("first quadrant");
        }
        else if (y>0 && x<0){
            System.out.println("second quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println("third quadrant ");
        } else System.out.println(" fourth quadrant");

    }
}
