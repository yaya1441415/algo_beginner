import java.util.Scanner;
/**
Least Common Multiple Problem
Compute the least common multiple of two positive integers.
Input: Two positive integers a
and b.
Output: The least common multiple of a and b
**/

public class Lcm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lcm(a, b));
        //System.out.println(gcd(a,b));

    }
    public static long gcd(long a, long b){
        long min = Math.min(a,b);
        long max = Math.max(a,b);
        long rest = max%min;
        if (rest==0){
            return min;
        }
        return gcd(min,rest);
    }
      //the function finds the least
      //common Multiple using gcd.
    public static long lcm(long a, long b){
        long  mult = a*b;
        long  dev = gcd(a, b);
        return mult/dev;

    }
}
