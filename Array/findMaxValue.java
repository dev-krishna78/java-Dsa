package Array;

public class findMaxValue {
    public static void main(String[]args){
        int arr[] = {10,2,23,45,1,2,33};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
