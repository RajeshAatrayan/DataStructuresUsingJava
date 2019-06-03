package Heaps;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Heaps|HeapSort.java| on Mar,2019
 * Happy Coding :)
 */
public class HeapSort {
    static Scanner scanner = new Scanner(System.in);
    public static final int MAX = 10;
    static int array[] = new int[MAX];
    static int n = 0;
    static int orgSize = 0;

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("Enter 1. to insert into heap");
            System.out.println("Enter 2.to display");
            System.out.println("Enter 3. for heapsort");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertIntoHeap();
                    break;
                case 2:
                    displayHeap();
                    break;
                case 3:
                    heapSort();
                    break;
            }
        } while (option <= 3);

    }

    private static void heapSort() {
        orgSize = n;
        for (int k = 1; k <= n; k++) {
            int temp = array[1];
            array[1] = array[n];

            int i = 1;
            int j = 2 * i;

           int ln= n--;

            while (j <= n) {
                if (array[j + 1] > array[j]) {
                    j = j + 1;
                }
                if (array[j] > array[i]) {
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;

                    i = j;
                    j = 2 * i;
                }


            }

            array[ln]=temp;


        }

        for(int x=1;x<=orgSize;x++){
            System.out.print(array[x]+" ");
        }


    }

    private static void displayHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void insertIntoHeap() {
        System.out.println("Enter the value of the element");
        int value = scanner.nextInt();
        ++n;
        array[n] = value;
        int temp = array[n];
        int i = n;
        while (i > 1 & temp > array[i / 2]) {
            array[i] = array[i / 2];
            i = i / 2;
        }
        array[i] = temp;


    }
}
