package Hashing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Hashing|LinearProbing.java| on Apr,2019
 * Happy Coding :)
 */
public class LinearProbing {

    static int hashTable[] = new int[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Arrays.fill(hashTable, 0);
        System.out.println("Enter the value");
        int value = scanner.nextInt();
        while (value != -1) {
            insertIntoHashTable(value);
            System.out.println("Enter the value");
            value = scanner.nextInt();
        }
        System.out.println("Want to search?");
        searchForElement(scanner.nextInt());


    }

    private static void searchForElement(int value) {
        int hashValue = hashFunction(value);
        if (hashTable[hashValue] == value) {
            System.out.println("Element found at " + hashValue);
        } else {
            int i = 0;
            while (hashTable[(hashValue + i)%10] != value) i++;
            System.out.println("Element found at " + (hashValue + i)%10);
        }


    }

    private static void insertIntoHashTable(int value) {
        int hashValue = hashFunction(value);
        int index;
        if (hashTable[hashValue] != 0) {
            index = findNextIndex(hashValue);
            hashTable[index] = value;
        } else {
            hashTable[hashValue] = value;
        }

    }

    private static int findNextIndex(int hashValue) {
        int i = 0;
        while (hashTable[(hashValue+i)%10] != 0) i++;
        return (hashValue+i)%10;
    }

    private static int hashFunction(int value) {
        return value % 10;
    }
}
