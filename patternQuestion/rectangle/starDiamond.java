package patternQuestion.rectangle;
import java.util.Scanner;
public class starDiamond {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();

         int nsp = n-1; ;
         int nst = 1;
         for(int i =1;i<=n;i++){ // rows
             for(int j =1;j<= nsp;j++){ // spaces
                 System.out.print(" "+" ");
             }
             for(int j =1;j<=nst;j++){ // stars
                 System.out.print("*"+ " ");
             }
             nsp--;
             nst += 2;
             System.out.println();
         }
        nsp = 1; ;
        nst = nst-4;
        for(int i =1;i<=n;i++){ // rows
            for(int j =1;j<= nsp;j++){ // spaces
                System.out.print(" "+" ");
            }
            for(int j =1;j<=nst;j++){ // stars
                System.out.print("*"+ " ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
        }


    }

