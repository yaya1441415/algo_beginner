import java.util.Scanner;
/**Compute the greatest common divisor of two
positive integers.
Input: Two positive integers a
and b.
Output: The greatest common divisor of a and b.
**/
public class GCd {
    public static void main(String[] atgs){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd(a, b));

    }
    //the function calculates GCD using
    //euclidean algorithm.
    //if a = bq+r. then:
    //gcd(a,b)=gcd(b,r)
    // and uses recursion.
    public static int gcd(int a, int b){

        int min = Math.min(a,b);// get min between a and b.
        int max = Math.max(a,b);// get max between a, and b.
        int rest = max%min;// get the rest.

        if (rest==0){
            return min;
        }
        return gcd(min,rest);
    }
}
