import java.util.Scanner;
/**
 * the program finds the fibonacci
 * number
 */
public class fibonocci {
    // initialize an array.
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

        //the array is used in a way
        // to store previously calculated
        //fibonocci numbers, to avoid calculating
        //fibonoci number multiple times.
        if (fibCash[n]!=0){
            return fibCash[n];
        }
        long nthNumber = (fibonnocci(n-1)+fibonnocci(n-2));
        fibCash[n]=nthNumber;
        return fibCash[n];
    }
}
