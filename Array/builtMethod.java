package Array;

import java.util.Arrays;

public class builtMethod {
    public static void main(String[]args){
        int[] arr = {1,12,32,11,23,44,10};
        int n = arr.length;

        // print arr using for each loop
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        // sort array using built method
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" " );
        }
    }
}
