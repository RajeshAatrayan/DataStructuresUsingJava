package Stacks;

import java.util.Scanner;
/*
Rajesh Aatrayan
remember the first node is the last node to visit so assign its next to null
 */

public class StackUsingLinkedList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            next = null;
        }

    }

    static Scanner scanner = new Scanner(System.in);

    static node top, newnode, ptr;

    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to insert");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to peek");
            System.out.println("Enter 4 to display");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertNode();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;

            }

        } while (option <= 4);

    }

    private static void display() {
        ptr = top;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    private static void peek() {
        if (top == null) System.out.println("Stack is empty");
        else {
            System.out.println("Value at peek is " + top.data);
        }
    }

    private static void pop() {
        if (top == null) {
            System.out.println("Underflow");
        } else {
            System.out.println("Value popped is :" + top.data);
            top = top.next;
        }
    }

    private static void insertNode() {
        System.out.println("Enter the node data");
        int value = scanner.nextInt();
        if (top == null) {
            newnode = new node(value);
            top = newnode;
        } else {
            newnode = new node(value);
            newnode.next = top;
            top = newnode;
        }

    }
}
