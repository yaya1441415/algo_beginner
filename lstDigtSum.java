import java.util.Arrays;
import java.util.Scanner;

public class lstDigtSum {
    public static void main(String[] atgs){
        //getting input from user.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibCash= new long[n+1];
        fibonnocci(n);
        if (n==0){
            System.out.println(0);
        }
        else
            System.out.println(sum%10);
    }
    private static long[] fibCash;
    private static long sum=1;


    public static long fibonnocci(int n){

        if(n<=1){
            return n;
        }

        fibCash[0]=0;
        fibCash[1]=1;
        //the array is used in a way
        // to store previously calculated
        //fibonocci numbers, to avoid calculating
        //fibonocci number multiple times.
        if (fibCash[n]!=0){
            return fibCash[n];
        }
        long nthNumber = (fibonnocci(n-1)+fibonnocci(n-2));
        fibCash[n]=nthNumber;

        sum+=nthNumber%10;
        return fibCash[n];
    }
}
