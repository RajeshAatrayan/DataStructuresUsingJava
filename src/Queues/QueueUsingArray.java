package Queues;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|Queues|JavaDataStructures| on Mar,2019
 * Happy Coding :)
 */
public class QueueUsingArray {
    static final int MAX = 10;
    static int queue[] = new int[MAX];
    static Scanner scanner = new Scanner(System.in);
    static int data;
    static int rear = -1, front = -1;

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

        if (front == -1 && rear == -1) System.out.println("Queue is empty");
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }

    private static void peek() {
        if (rear == -1) System.out.println("Queue is empty");
        else {
            System.out.println("The peek value is: " + queue[rear]);
        }
    }

    private static void deque() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
        } else {
            System.out.println("The value popped is " + queue[++front]);
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    private static void eneque() {
        System.out.println("Enter the value to insert");
        data = scanner.nextInt();
        if (rear == MAX - 1) {
            System.out.println("Overflow");
            return;
        } else if (front == -1 && rear == -1) {//increment both front and rear here
            rear++;
            front++;
        } else rear++;
        queue[rear] = data;


    }
}
