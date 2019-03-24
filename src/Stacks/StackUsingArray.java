package Stacks;

import java.util.Scanner;

public class StackUsingArray {
    static final int MAX = 10;
    static int top = -1;
    static int array[] = new int[MAX];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.println("Enter 1 to insert");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to peek");
            System.out.println("Enter 4 to display");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insert();
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
        if (top == -1) System.out.println("Stack is empty");
        else {
            for (int i = top; i >= 0; i--) System.out.print(array[i] + " ");
            System.out.println();
        }
    }

    private static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Value at peek :" + array[top]);
        }
    }

    private static void pop() {
        if (top == -1) {
            System.out.println("Underflow! there is nothing to pop out");
        } else {
            System.out.println("Value popped :" + array[top--]);
        }

    }

    private static void insert() {
        if (top == MAX - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter the value into the stack");

            array[++top] = scanner.nextInt();
        }
    }


}
