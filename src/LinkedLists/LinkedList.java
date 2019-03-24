package LinkedLists;

import java.util.Scanner;

public class LinkedList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            next = null;
        }
    }

    static node start, ptr, newnode, preptr;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to insert");
            System.out.println("Enter 2 to Display");
            System.out.println("Enter 3 to delete");
            System.out.println("Enter 4 to delete Node before");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertNode();
                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    deleteNode();
                    break;
                case 4:
                    deleteBefore();
                    break;

            }

        } while (option <= 4);
    }

    private static void deleteBefore() {
        System.out.println("Enter the node before which you want to delete");
        int value = scanner.nextInt();
        preptr = null;
        ptr = start;
        while (ptr.next.data != value) {
            preptr = ptr;
            ptr = ptr.next;
        }
        if (ptr == start) start = start.next;

        preptr.next = ptr.next;
        ptr = null;

    }

    private static void deleteNode() {
        System.out.println("Enter the node value to delete");
        int value = scanner.nextInt();
        ptr = start;
        preptr = null;


        preptr = ptr;
        while (ptr.data != value) {
            preptr = ptr;
            ptr = ptr.next;
        }
        preptr.next = ptr.next;
        ptr = null;


    }

    private static void displayList() {
        ptr = start;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();


    }

    private static void insertNode() {

        System.out.println("Enter the data of the node");
        int value = scanner.nextInt();
        if (start == null) {
            newnode = new node(value);
            start = newnode;
            start.next = null;
        } else {
            ptr = start;
            while (ptr.next != null) ptr = ptr.next;
            newnode = new node(value);
            ptr.next = newnode;

        }
    }
}
