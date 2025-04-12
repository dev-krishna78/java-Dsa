package Array;
import java.util.Scanner;
public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;

        // input for user
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        // print array
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
