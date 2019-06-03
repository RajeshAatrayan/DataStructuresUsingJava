package Recursion;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Recursion|SumOfnNumber.java| on Jun,2019
 * Happy Coding :)
 */
public class SumOfnNumber {
    /*
    direc formula to calculate sum of n natural numbers

     */
    public  static  int sumofnumbers(int n){
        if(n==0)return 0;

        return n+sumofnumbers(n-1);
    }

    public static void main(String[] args) {

        System.out.println(sumofnumbers(100));
    }
}
