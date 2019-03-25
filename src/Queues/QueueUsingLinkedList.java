package Queues;

import java.util.*;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Queues|QueueUsingLinkedList.java| on Mar,2019
 * Happy Coding :)
 */
public class QueueUsingLinkedList {
    /*
    Class for linked list
     */
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Class for queue data strucutre
     */
    static class Queue {
        node front;
        node rear;
    }

    static Queue queue = new Queue();
    static node newnode, ptr, start;
    static Scanner scanner = new Scanner(System.in);
    static int value;

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
        ptr = queue.front;

        while (ptr != queue.rear) {
            System.out.print(ptr.data+" esa");
            ptr = ptr.next;
        }
        System.out.print(ptr.data);
        System.out.println();
    }

    private static void peek() {
        if (queue.rear == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("The peek value is " + queue.rear.data);
        }
    }

    private static void deque() {
        if (queue.front == null) {
            System.out.println("Underflow");
        } else {
            System.out.println("The popped value is " + queue.front.data);
            queue.front = queue.front.next;
        }

    }

    private static void eneque() {
        /**
         * There will be no condition for overflow in linkedlists
         */
        if (queue.rear == null && queue.front == null) {
            System.out.println("Enter the node value");
            value = scanner.nextInt();
            newnode = new node(value);
            queue.rear = queue.front = newnode;
        } else {
            System.out.println("Enter the node value");
            value = scanner.nextInt();
            newnode = new node(value);
            queue.rear.next = newnode;
            queue.rear=newnode;//important
        }
    }
}
