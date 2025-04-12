package patternQuestion.rectangle;
import java.util.Scanner;
public class rectangleNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of rows ");
        int n = sc.nextInt();
        System.out.println(" enter the value of colm ");
        int m  = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

    // for single number is row
    for(int i =1; i<=n;i++){
        for (int j =1; j<=m;j++){
            System.out.print(i);
        }
        System.out.println();
    }

    }
}
