package loops;
import java.util.Scanner;
public class numberIsDivedBy {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = 5;
        int num2 = 3;

        for(int i =1;i<=50;i++){
           if(i%num1==0 || i%num2==0) System.out.println(i);
        }
    }
}
