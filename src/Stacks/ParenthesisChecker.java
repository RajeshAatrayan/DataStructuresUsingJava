package Stacks;

import java.util.Scanner;

public class ParenthesisChecker {
    static final int MAX = 10;
    static char arr[] = new char[MAX];
    static int top = -1;
    static int flag = 1;

    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                push(c);

            else if (c == ')' || c == '}' || c == ']') {
                char temp = pop();
                if (temp != -1) {

                    if (c == '(' && (temp == '}' || temp == ']')) flag = 0;
                    else if (c == '{' && (temp == ')' || temp == ']')) flag = 0;
                    else if (c == '[' && (temp == '}' || temp == ')')) flag = 0;


                }


            }
        }

        if (flag == 0) {
            System.out.println("Not a valid expression");
        } else {
            System.out.println("Valid expression");
        }

    }

    private static char pop() {
        if (top == -1) {
            flag = 0;
            return (char) -1;
        } else {
            return arr[top--];
        }
    }

    private static void push(char charAt) {
        if (top == MAX - 1) System.out.println("Overflow");
        else {
            arr[++top] = charAt;
        }
    }
}
