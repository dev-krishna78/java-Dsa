package patternQuestion.rectangle;
import java.util.Scanner;
public class specialPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the row value ");
        int n = sc.nextInt();
//        System.out.println("enter the colm");
//        int r = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==3 || j==3) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
