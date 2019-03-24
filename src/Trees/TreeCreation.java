package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeCreation {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static node start, ptr, newnode;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<node> queue = new LinkedList<>();

        System.out.println("Enter the root node value");
        int value = scanner.nextInt();
        if (start == null) {
            newnode = new node(value);
            start = newnode;
        }
        queue.add(start);
        node temp;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            System.out.println("Enter the left node data of " + temp.data);
            int val = scanner.nextInt();
            if (val == 0) break;
            if (val != -1) {
                newnode = new node(val);
                temp.left = newnode;
                queue.add(newnode);
            }
            System.out.println("Enter the right node data of " + temp.data);
            val = scanner.nextInt();

            if (val != -1) {
                newnode = new node(val);
                temp.right = newnode;
                queue.add(newnode);
            }

        }

        System.out.println("1. to preorder");
        System.out.println("2. to inorder");
        System.out.println("3. to postorder");

        value = scanner.nextInt();
        switch (value) {
            case 1:
                preoder(start);
                break;
            case 2:
                inorder(start);
                break;
            case 3:
                postorder(start);
                break;
        }


    }

    private static void postorder(node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

    }

    private static void inorder(node root) {
        if (root != null) {

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }

    private static void preoder(node root) {

        if (root != null) {
            System.out.print(root.data + " ");
            preoder(root.left);
            preoder(root.right);
        }

    }


}
