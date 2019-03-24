package LinkedLists;

import java.util.Scanner;

public class CircularLinkedList {
    static class node {
        int data;
        node next;


        node(int data) {
            this.data = data;


        }
    }

    static node start;
    static node ptr;
    static node newnode;
    static node preptr;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to insert");
            System.out.println("Enter 2 to Display");
            System.out.println("Enter 3 to to insert at beg");
            System.out.println("Enter 4 to insert at end");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertNode();
                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    insertAtBeg();
                    break;
                case 4:
                    insertAtEnd();
                    break;

            }

        } while (option <= 4);
    }

    private static void insertAtEnd() {
        System.out.println("Enter the value of the beg node");
        int value = scanner.nextInt();
        ptr = start;
        while (ptr.next != start) {
            ptr = ptr.next;
        }
        newnode = new node(value);
        ptr.next = newnode;
        newnode.next = start;


    }

    private static void insertAtBeg() {
        System.out.println("Enter the value of the beg node");
        int value = scanner.nextInt();
        ptr = start;
        while (ptr.next != start) {
            ptr = ptr.next;
        }
        newnode = new node(value);
        ptr.next = newnode;
        newnode.next = start;
        start = newnode;
    }

    private static void displayList() {
        ptr = start;
        while (ptr.next != start) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println(ptr.data);
        System.out.println();
    }

    private static void insertNode() {
        System.out.println("Enter the node value");
        int value = scanner.nextInt();
        if (start == null) {
            newnode = new node(value);
            start = newnode;
            start.next = start;
        } else {
            ptr = start;
            newnode = new node(value);
            while (ptr.next != start) {

                ptr = ptr.next;
            }
            ptr.next = newnode;
            newnode.next = start;


        }

    }
}
