import java.util.Arrays;
import java.util.Scanner;
/**
Compute the last digit of the n-th Fibonacci
number.
Input: An integer n.
Output: The last digit of the n-th
Fibonacci number.
**/

public class fibLastDigit {
    private static long[] fibCash;
    public static void main(String[] atgs){

        //getting input from user.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibCash= new long[n+1];
        System.out.println(fibonnocci(n));
    }
    public static long fibonnocci(int n){
        if(n<=1){
            return n;
        }
        fibCash[0] = 0;
        fibCash[1] = 1;
        for(int i =2; i<=n; i++){
            fibCash[i] = (fibCash[i-1]+fibCash[i-2])%10;
        }
        return fibCash[n];


    }
}
