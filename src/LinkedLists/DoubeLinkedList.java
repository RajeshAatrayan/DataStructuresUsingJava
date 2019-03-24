package LinkedLists;

import java.util.Scanner;

public class DoubeLinkedList {

    static class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            next = null;
            prev = null;
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
            System.out.println("Enter 3 to delete");
            System.out.println("Enter 4 to reverse printing");
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
                    reversePrint();
                    break;

            }

        } while (option <= 4);


    }

    private static void reversePrint() {
        ptr=start;
        while(ptr.next!=null)ptr= ptr.next;
        while(ptr!=null){
            System.out.print(ptr.data);
            ptr=ptr.prev;
        }
        System.out.println();
    }

    private static void deleteNode() {
        ptr = start;
        System.out.println("Enter the value of the node to delete");
        int value = scanner.nextInt();
        while (ptr.data != value) ptr = ptr.next;
        if (ptr == start) {
            ptr = ptr.next;
            start = ptr;
            start.prev = null;
        } else if (ptr.next == null) {
            ptr.prev.next = null;
        } else {
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
            ptr = null;
        }


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
        System.out.println("Enter the node to value insert");
        int value = scanner.nextInt();
        if (start == null) {
            newnode = new node(value);
            start = newnode;

        } else {
            ptr = start;
            while (ptr.next != null) ptr = ptr.next;
            newnode = new node(value);
            ptr.next = newnode;
            newnode.prev = ptr;
            newnode.next = null;

        }
    }
}
