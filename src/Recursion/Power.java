package Recursion;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Recursion|Power.java| on Jun,2019
 * Happy Coding :)
 */
public class Power {

    public static int exp(int m, int n) {
        if (n == 0) return 1;

        return m * exp(m, n - 1);
    }

    /*
     * In the above method each exp(m,n) divides into granular leve to find the power
     *
     * the below given soln is some what better than the above
     *
     * public static int exp(int m, int n) {
     *         if (n == 0) return 1;
     *
     *         if(n%2==0){  //that means power is even
     *           return exp(m*m,n/2);
     *         }
     *
     *         else if(n%2!=0){ //that means power is odd
     *
     *         return m*exp(m*m,(n-1)/2);
     *         }
     *
     *         return m * exp(m, n - 1);
     *     }
     *
     */


    public static void main(String[] args) {
        System.out.println(exp(2, 5));
    }
}
