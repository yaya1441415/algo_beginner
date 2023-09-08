import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hugefib {
    public static long[] matrix_mult(long[] A, long[] B,long k){

       return new long[] {(A[0]*B[0]+A[1]*B[2])%k,
                (A[0]*B[1]+A[1]*B[3])%k,
                (A[2]*B[0]+A[3]*B[2])%k,
                (A[2]*B[1]+A[3]*B[3])%k};

    }
    public static long[] matrix_Power(long[] A, long m, long K){

        if (m==0){

            return new long[]{1l, 0l, 0l, 1l};
        }
        if (m==1){
            return A;
        }
        else {
            long[] B = A;
            int n = 2;
            while(n<=m){
                B = matrix_mult(B,B,K);
                n = n*2;

            }
            long[] R = matrix_Power(A, m-n/2,K);
            return matrix_mult(B,R,K);
        }
    }
    public static long fibonnocci(long n, long m){
        long[] num = {1l,1l,1l,0l};

        long[] fib = matrix_Power(num,n,m);
        return fib[1]%m;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        System.out.println(fibonnocci(n, m));
    }
}
