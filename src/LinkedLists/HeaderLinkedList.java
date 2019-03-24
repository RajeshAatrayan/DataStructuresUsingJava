package LinkedLists;

import java.util.Scanner;

public class HeaderLinkedList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            next = null;
        }

        node() {
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


            }

        } while (option <= 2);

    }

    private static void displayList() {
        ptr = start.next;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr=ptr.next;
        }
        System.out.println();
    }

    private static void insertNode() {
        System.out.println("Enter the node to insert");
        int value = scanner.nextInt();
        newnode = new node(value);
        if (start == null) {
            start = new node();
            start.next = newnode;
        } else {
            ptr = start;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newnode;
            newnode.next = null;
        }
    }
}
