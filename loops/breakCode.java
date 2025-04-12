package loops;

import java.util.Scanner;

public class breakCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number ");
        int n = sc.nextInt();

        int x =0; // x is 0 means prime
        // check the number is composite

         for(int i = 2; i<= n-1 ; i++) {
             if (n % i == 0) { // 'i' is a factor of 'n'
                 System.out.println();
                 x= 1;  // 1 means composite
                 break;
             }
         }

         if(n==1) System.out.println("neither prime or composite ");
         else if(x==0) System.out.println(" prime number ");
}
}
