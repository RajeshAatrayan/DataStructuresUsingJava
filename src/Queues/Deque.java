package Queues;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Queues|Deque.java| on Mar,2019
 * Happy Coding :)
 */

import java.util.Scanner;

/**
 * Deque is of two types:
 * 1.Input restricted(deletions can be done on both ends)
 * 2.Output restricted(insertions can be done on both ends)
 * <p>
 * We need to implement circular queue for it
 */
public class Deque {
    static final int MAX = 10;
    static int queue[] = new int[MAX];
    static int value;
    static int left = -1, right = -1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        System.out.println("Enter 1 for input restricted");
        System.out.println("Enter 2 for output restricted");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                inputRestricted();
                break;
            case 2:
                outputRestricted();
                break;
        }


    }

    private static void outputRestricted() {
    }

    private static void inputRestricted() {
        int option;
        do {
            System.out.println("Enter 1 to eneque");
            System.out.println("Enter 2 to leftDeque");
            System.out.println("Enter 3 for rightDeque");
            System.out.println("Enter 4 for display");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    rightEneque();
                    break;
                case 2:
                    leftDeque();
                    break;
                case 3:
                    rightDeque();
                    break;
                case 4:
                    display();
                    break;
            }
        } while (option <= 4);

    }

    private static void display() {

        int l = left, r = right;
        if (l <= r) {
            while (l <= r) {
                System.out.print(queue[l++] + " ");
            }
        } else {

            for (int i = l; i <= MAX - 1; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = r; i < l; i++) {
                System.out.print(queue[i] + " ");
            }

        }
        System.out.println();
    }

    private static void rightDeque() {
        if (left == -1) {
            System.out.println("Underflow!");
            return;
        } else if (right == 0) {//important step in deque
            System.out.println("Element deleted is " + queue[right]);
            right = MAX - 1;
        } else if (left == right) {
            System.out.println("Element deleted is " + queue[right]);
            left = right = -1;
        } else {
            System.out.println("Element deleted is " + queue[right]);
            right--;
        }


    }

    private static void leftDeque() {
        if (left == -1) {
            System.out.println("Underflow!");
            return;
        } else if (left == MAX - 1) {

            System.out.println("Element deleted is " + queue[left]);
            left = 0;
        } else if (left == right) {
            System.out.println("Element deleted is " + queue[left]);
            left = right = -1;
        } else {

            System.out.println("Element deleted is " + queue[left]);
            left++;
        }


    }

    private static void rightEneque() {
        if (left == 0 && right == MAX - 1) {
            System.out.println("Overflow");
            return;
        } else if (left == -1 && right == -1) {
            System.out.println("Enter the data");
            value = scanner.nextInt();
            left = right = 0;
            queue[right] = value;
        } else if (left != 0 && right == MAX - 1) {//condition for circular queue
            right = 0;
            System.out.println("Enter the data");
            value = scanner.nextInt();
            queue[right] = value;

        } else {
            System.out.println("Enter the data");
            value = scanner.nextInt();
            queue[++right] = value;
        }


    }

}


