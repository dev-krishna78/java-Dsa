package Array;

public class twoSum {
    public static void main(String[] args) {
        // sum is equal to the given value x.(Two Sum)
        int[] arr ={3,-1,8,5,4,9,2};
        int x = 9;   // target value
        int n = arr.length;
        // solution
        for(int i =0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j] == x){
                    System.out.println(arr[i]+" "+ arr[j]);
                    // break;
                }
            }
        }

    }
}
