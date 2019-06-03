package Heaps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Heaps|DeletionOfHeap.java| on Mar,2019
 * Happy Coding :)
 */
public class DeletionOfHeap {
    static int n = 0;
    static int heapArray[] = new int[11];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Enter 1 to insert into heap");
            System.out.println("Enter 2 to delete node from the heap");
            System.out.println("Enter 3 to display the heap");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertIntoHeap();
                    break;
                case 2:
                    deleteNode();
                    break;
                case 3:
                    displayHeap();
                    System.out.println();
                    break;
            }

        } while (option <= 3);
    }

    private static void deleteNode() {
        int temp = heapArray[n];
        heapArray[1] = temp;
        int i = 1;
        int j = 2 * i;
        n--;
        while (j <= n) {
            if (heapArray[j + 1] > heapArray[j]) {
                j = j + 1;
            }
            if (heapArray[j] > heapArray[i]) {

                int t = heapArray[j];

                heapArray[j] = heapArray[i];

                heapArray[i] = t;

                i = j;
                j = 2 * i;
            } else {//if it not greater
                break;

            }


        }


    }

    private static void swap(int j, int i, int j1, int i1) {
        int temp = j;

        heapArray[j1] = i;
        heapArray[i1] = temp;

    }

    private static void displayHeap() {
        System.out.println("The heap consists of :");
        for (int i = 1; i <= n; i++) {
            System.out.print(heapArray[i] + " ");
        }
    }

    private static void insertIntoHeap() {
        System.out.println("Enter the  value to  be inserted");
        int value = scanner.nextInt();
        n++;
        heapArray[n] = value;//store the value in the heap
        //store the value in the temp variable
        int temp = heapArray[n];
        //the node at which we inserted,we need to track back to root node from this node
        int i = n;
        //temp>heapArray[i/2] says if the inserted value is greater than the parent
        while (i > 1 & temp > heapArray[i / 2]) {
            heapArray[i] = heapArray[i / 2];
            i = i / 2;
        }
        heapArray[i] = temp;


    }
}
