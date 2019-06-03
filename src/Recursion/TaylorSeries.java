package Recursion;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Recursion|TaylorSeries.java| on Jun,2019
 * Happy Coding :)
 *
 * Formual:  e^x = 1 + x +  x^2/2!  +  x^3/3!  +  x^4/4!  +  x^5/5!  + ...
 */

public class TaylorSeries {
    static int p = 1, f = 1;

    static int series(int x, int n) {

        if (n == 0) return 1;
        else {
            int r = series(x, n - 1);
            p = p * x;
            f = f * n;
            return r + p / f;
        }

    }

    public static void main(String[] args) {
        System.out.println(series(5, 13));
    }


}

/*
 * Taylor series Iterative method
 *
 * static int num=1,den=1,sum=1;
 * static int series(int x,int n){
 *     for(int i=1;i<=n;i++){
 *         num=num*x;
 *         den=den*i;
 *
 *         sum+=sum+num/den
 *     }
 *     return sum;
 * }
 */
