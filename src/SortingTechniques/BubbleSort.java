package SortingTechniques;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|SortingTechniques|BubbleSort.java| on Mar,2019
 * Happy Coding :)
 */

/**
 * BubbleSort takes O(n^2)
 */
public class BubbleSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = {10, 20, 1, 3, 5, 9, 8, 7};
        int n = array.length;
        int opt = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) { //here n-i-1 because we need to compare the last unsorted element

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    opt = 1;
                }
            }

            if (opt == 0) {
                //it means array is already sorted so it will take O(n)
                break;

            }


        }

        for (int a : array) {
            System.out.print(a + " ");
        }


    }

}

