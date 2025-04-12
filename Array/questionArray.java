package Array;
import java.util.Scanner;
public class questionArray{
 public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     System.out.println(" enter the value ");
     int x = sc.nextInt();
     // find two array index sum is equal to x
     int[] arr = {2, 3, 5, 7, 4, 3};
     int n = arr.length;

     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             if (arr[i] + arr[j] == x) {
                 System.out.println(" index of " + i + " " + j + " equal " + x);
                 break;
             }
//             } else{
//                 System.out.print(" two index sum is not equal to " + x);
//             break;
//             }

         }
     }
 }
}


