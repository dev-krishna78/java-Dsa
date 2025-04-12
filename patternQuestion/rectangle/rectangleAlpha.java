package patternQuestion.rectangle;
import java.util.Scanner;
public class rectangleAlpha {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of rows ");
        int n = sc.nextInt();
        System.out.println(" enter the value of colm ");
        int m  = sc.nextInt();

        // same element is row
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i =1;i<= n;i++){
            for(int j =1;j<=m;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
