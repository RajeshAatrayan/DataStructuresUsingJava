package Hashing;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Hashing|Chaining.java| on Apr,2019
 * Happy Coding :)
 */
public class Chaining {
    static class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }

        node() {
            next = null;
        }
    }

    static node newnode, ptr, start, preptr;
    static node hashTable[] = new node[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int value;
        System.out.println("Enter the key");
        value = scanner.nextInt();
        while (value != -1) {


            insertIntoHashTable(value);
            System.out.println("Enter the key");
            value = scanner.nextInt();
        }

        System.out.println("Search for element?");
        searchElement(scanner.nextInt());
    }

    private static void searchElement(int nextInt) {
        int hashValue = hashFunction(nextInt);
        ptr = hashTable[hashValue];
        while (ptr != null) {
            if (ptr.data == nextInt) {
                System.out.println("found");
            }
            ptr = ptr.next;
        }
    }

    private static void insertIntoHashTable(int value) {
        int hashValue = hashFunction(value);
        if (hashTable[hashValue] == null) {
            hashTable[hashValue] = new node();
            newnode = new node(value);
            hashTable[hashValue].next = newnode;

        } else {

            ptr = hashTable[hashValue].next;
            preptr = ptr;
            while (ptr != null && value > ptr.data) {
                preptr = ptr;
                ptr = ptr.next;

            }
            preptr.next = new node(value);
            preptr.next.next = ptr;


        }

    }

    private static int hashFunction(int value) {
        return value % 10;
    }

}
