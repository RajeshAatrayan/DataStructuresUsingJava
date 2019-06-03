package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Trees|SumOfLeafNodesInABinaryTree.java| on Apr,2019
 * Happy Coding :)
 */
public class SumOfLeafNodesInABinaryTree {
    static class node {
        int data;
        node left;
        node right;
        node prev;

        node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    static Queue<node> queue = new LinkedList<>();
    static node ptr, newnode, preptr, root;
    static int sum = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the root node");
        int value = scanner.nextInt();
        root = new node(value);
        root.prev = null;
        queue.add(root);

        while (!queue.isEmpty()) {
            ptr = queue.poll();
            System.out.println("Enter the left node of" + ptr.data);
            value = scanner.nextInt();
            if (value == 0) break;
            if (value != -1) {
                newnode = new node(value);
                newnode.prev = ptr;
                ptr.left = newnode;
                queue.add(newnode);
            }

            System.out.println("Enter the right node of" + ptr.data);
            value = scanner.nextInt();
            if (value != -1) {
                newnode = new node(value);
                newnode.prev = ptr;
                ptr.right = newnode;
                queue.add(newnode);
            }


        }


        int height = findHeight(root);
        System.out.println("Height of the tree is " + height);
        sumOfLast(root);
        System.out.println("Sum of last nodes " + sum);


    }

    private static void sumOfLast(node ptr) {


        if (ptr != null) {
            sumOfLast(ptr.left);
            sumOfLast(ptr.right);
            if (ptr.left == null && ptr.right == null) {

                int v = findMyHeight(root, ptr);


                if (v == 3) {
                    sum = sum + ptr.data;
                }
            }

        }


    }


    private static int findMyHeight(node root, node ptr) {
        int i = 0;
        while (root != ptr) {
            ptr = ptr.prev;
            i++;
        }

        return i + 1;
    }

    private static int findHeight(node root) {
        if (root != null) {
            int x, y;
            x = findHeight(root.left);
            y = findHeight(root.right);

            if (x > y) return x + 1;
            else return y + 1;
        }
        return 0;

    }

}
