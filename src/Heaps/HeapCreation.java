package Heaps;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Heaps|HeapCreation.java| on Mar,2019
 * Happy Coding :)
 */


import java.util.Scanner;

/**
 * We took heap array size as 10;
 */
public class HeapCreation {
    static int n = 1;
    static int heapArray[] = new int[11];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Enter 1 to insert into heap");
            System.out.println("Enter 2 to display the heap");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertIntoHeap();
                    break;
                case 2:
                    displayHeap();
                    System.out.println();
                    break;
            }

        } while (option <= 2);
    }

    private static void displayHeap() {
        System.out.println("The heap consists of :");
        for (int i = 1; i < n; i++) {
            System.out.print(heapArray[i] + " ");
        }
    }

    private static void insertIntoHeap() {
        System.out.println("Enter the  value to  be inserted");
        int value = scanner.nextInt();
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
        n++;

    }
}
