import java.util.Scanner;

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

    public static long lcm(long a, long b){
        long  mult = a*b;
        long  dev = gcd(a, b);
        return mult/dev;

    }
}
