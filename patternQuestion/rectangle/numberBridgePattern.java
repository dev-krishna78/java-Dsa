package patternQuestion.rectangle;
import java.util.Scanner;
public class numberBridgePattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter value ");
        int n = sc.nextInt();

        for(int i =1;i<=2*n-1;i++) {   // number
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
         int nsp =1;
        for(int i =1; i<=n;i++){ //row
            int a =1;
            for(int j =1;j<=n+1-i;j++){  // number
                System.out.print(a++ +" ");

            }
            for(int j =1;j<=nsp;j++){   // spaces
                System.out.print(" "+" ");
                a++;  // very important
            }
            nsp +=2;

            for(int j =1;j<=n+1-i;j++){  // number
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
