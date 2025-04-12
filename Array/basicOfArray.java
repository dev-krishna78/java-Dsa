package Array;

public class basicOfArray {
    public static void main(String[]args){
        // array declaration or initialising

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[0]+ " " + arr[1]+" ");
        System.out.println(arr[2]+ " " + arr[3]+" ");
        System.out.println(arr[4]+ " " + arr[1]+" ");

        System.out.println();

        // different way to declaration or initialing

        int[] arr1 = {1,2,3,4,5,6};
        for(int i =0;i<=5;i++){
            System.out.println(arr1[i]);
        }

    }
}
