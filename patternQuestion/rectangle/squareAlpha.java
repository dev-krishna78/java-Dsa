package patternQuestion.rectangle;

import java.util.Scanner;

public class squareAlpha {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of rows ");
        int n = sc.nextInt();


        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }

        System.out.println();

        // single element in row
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
