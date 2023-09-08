import java.util.Arrays;
import java.util.Random;
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
        long n = in.nextLong();

        System.out.println(fib_2(n));
        //test();

    }
    public static long fib_2(long n){
        if (n<=1){
            return n;
        }
        return fib_2(n-1)+fib_2(n-2)%100;
    }
    public static void test(){
        boolean cond = true;
        Random random = new Random();
        while(cond) {

            int num = random.nextInt(0,30);
            if (lstfib(num) == getFibonacciSumNaive(num)) {
                System.out.println("true");
            }
            else{
                System.out.println("false");
                System.out.println(num);
                System.out.println(Arrays.toString(fibCash));
                System.out.println(lstfib(num) + " != " + getFibonacciSumNaive(num));
                break;
            }
        }


    }
    public static long fibonnocci(int n){
        fibCash= new long[n+1];
        if(n<=1){
            return n;
        }
        fibCash[0] = 0;
        fibCash[1] = 1;
        for(int i =2; i<=n; i++){
            fibCash[i] = (fibCash[i-1]+fibCash[i-2])%100;
        }
        return fibCash[n];

    }
    public static long lstfib(int num){

        long sum=0 ;
        long n = fibonnocci(num+2);

        sum+= (n-fibCash[1]);
        return sum%10;

    }
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }

        return sum % 10;
    }
}
