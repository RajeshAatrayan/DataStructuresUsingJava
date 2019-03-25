package Queues;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Queues|CircularQueue.java| on Mar,2019
 * Happy Coding :)
 */
public class CircularQueue {
    /**
     * We use array to implement circular queue to justify the problem we are facing with the linear queue
     */
    static final int MAX = 10;
    static int queue[] = new int[MAX];
    static Scanner scanner = new Scanner(System.in);
    static int front = -1, rear = -1;
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

        if (front > rear) {
            for (int i = 0; i < rear; i++) {
                System.out.print(queue[i]);
            }
            for (int i = rear; i <= front; i++) {
                System.out.print(queue[i]);
            }
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]);
            }
        }
        System.out.println();
    }

    private static void peek() {
        if (front == -1 && rear == -1) System.out.println("Queue is empty");
        else System.out.println("The element is " + queue[rear]);
    }

    private static void deque() {
        if (front == -1) {
            System.out.println("Underflow");
            return;
        } else {
            value = queue[front];
            System.out.println("The value popped is " + value);
            if (front == rear) front = rear = -1;
            else if (front == MAX - 1) front = 0;
            else front++;

        }
    }

    private static void eneque() {
        System.out.println("Enter the data to insert");
        value = scanner.nextInt();
        if (rear == MAX - 1) {
            System.out.println("Overflow");
            return;
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = value;
        } else if (front != 0 && rear == MAX - 1) {
            rear = 0;
            queue[rear] = value;
        } else {
            queue[++rear] = value;
        }
    }
}
