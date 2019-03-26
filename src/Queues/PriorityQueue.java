package Queues;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Queues|PriorityQueue.java| on Mar,2019
 * Happy Coding :)
 */
public class PriorityQueue {
    static class node {
        char data;
        int priority;
        node next;

        node(char data, int priority) {
            this.data = data;
            this.priority = priority;
            next = null;
        }
    }

    static node newnode, start, ptr;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Enter 1 to eneque");
            System.out.println("Enter 2 to deque");
            System.out.println("Enter 3 for peek");
            System.out.println("Enter 4 for display");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    eneque();
                    break;
                case 2:
                    deque();
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
        if (start != null) {
            ptr = start;
            while (ptr != null) {
                System.out.print(ptr.data + "->" + ptr.priority + " ");
                ptr = ptr.next;
            }
        }
        System.out.println();
    }

    private static void peek() {

        if (start == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Element with teh highest priority " + start.data);
        }
    }

    private static void deque() {
        /*
        element with the higher priority will be removed first
         */
        if (start == null) {
            System.out.println("Underflow");
        } else {
            start = start.next;
        }
    }

    private static void eneque() {
        System.out.println("Enter the element");
        String str = scanner.next();
        char value = 0;
        if (!str.isEmpty())
            value = str.charAt(0);
        scanner.nextLine();
        System.out.println("Entert the priority for the element");
        int elementPriority = scanner.nextInt();
        if (start == null) {
            newnode = new node(value, elementPriority);
            start = newnode;
        } else {
            ptr = start;
            while (ptr.next != null && ptr.next.priority <= elementPriority) ptr = ptr.next;
            newnode = new node(value, elementPriority);
            newnode.next = ptr.next;
            ptr.next = newnode;
        }


    }
}
