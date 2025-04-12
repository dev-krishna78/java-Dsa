package Array;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" enter the value you will find ");
        int x = sc.nextInt();
        System.out.println(" enter the array element ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        for(int i =0; i<n;i++){
            if(arr[i] == x) {
                flag = true;
                break;
            }
        }
        if( flag == true ) System.out.println(" element found");
        else System.out.println(" element not found ");

    }
}
