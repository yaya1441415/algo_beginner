import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //fibCash= new long[n+1];
        System.out.println(fib(n));


    }
    public static long fib(int number ){
        long[] array = new long[number+1];
        if (number<=1){
            return number;
        }
        array[0]=0;
        array[1]=1;
        long sum = 1;

        for (int i =2; i<=number;i++){
            array[i] =( array[i-1]+array[i-2]);
            sum+= array[i]%10;

        }
        return sum%10;
        //System.out.println(Arrays.toString(array));
    }

}