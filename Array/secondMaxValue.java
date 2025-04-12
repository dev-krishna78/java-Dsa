package Array;

public class secondMaxValue {
    public static void main(String[] args) {
        int arr[] = {10,1,2,40,56,23,32};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);

        int smx = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i] != mx){
                smx = Math.max(smx,arr[i]);
            }


        }
        System.out.println("first largest value " + mx);
        System.out.println(" second largest value " + smx);
    }
}
