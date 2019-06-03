package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Trees|OperationsOnTrees.java| on Mar,2019
 * Happy Coding :)
 */

/**
 * This program includes all the operation on tress like height,count nodes,level wise traversal,height of tree
 */
public class OperationsOnTrees {
    static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static node root, newnode, ptr;
    static int value;
    static Queue<node> queue = new LinkedList<>();

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("Enter 1 to insert into Binary Tree");
            System.out.println("Enter 2 to level wise traversal");
            System.out.println("Enter 3 to count the number of nodes");
            System.out.println("Enter 4 to sum all the nodes");
            System.out.println("Enter 5 to find the height of the tree");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertIntoBinaryTree();
                    break;
                case 2:
                    levelWiseTraversalOfBinaryTree();
                    System.out.println();
                    break;
                case 3:
                    int c = countNodes(root);
                    System.out.println("Count:" + c);
                    break;
                case 4:
                    int sum = sumOfNodes(root);
                    System.out.println(sum);
                    break;
                case 5:
                    int height = heightOfBinaryTree(root);
                    System.out.println("Height:" + height);
                    break;
            }


        } while (option <= 5);
    }

    private static int heightOfBinaryTree(node root) {
        int x, y;
        if (root != null) {
            x = heightOfBinaryTree(root.left);
            y = heightOfBinaryTree(root.right);
            if (x > y)
                return x + 1;
            else return y + 1;
        }
        return 0;
    }

    private static int sumOfNodes(node root) {
        int x, y;
        if (root != null) {
            x = sumOfNodes(root.left);
            y = sumOfNodes(root.right);
            return x + y + root.data;
        }
        return 0;
    }

    private static int countNodes(node root) {
        int x, y;
        if (root != null) {
            x = countNodes(root.left);
            y = countNodes(root.right);
            return x + y + 1;
        }
        return 0;
    }

    private static void levelWiseTraversalOfBinaryTree() {
        queue.clear();
        queue.add(root);

        while (!queue.isEmpty()) {
            ptr = queue.poll();
            System.out.print(ptr.data + " ");

            if (ptr.left != null)
                queue.add(ptr.left);
            if (ptr.right != null)
                queue.add(ptr.right);


        }


    }


    private static void insertIntoBinaryTree() {
        System.out.println("Enter the root node");
        value = scanner.nextInt();
        if (root == null) {
            newnode = new node(value);
            root = newnode;
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            ptr = queue.poll();
            System.out.println("Enter the left node of " + ptr.data);
            value = scanner.nextInt();
            if (value == 0) break;
            if (value != -1) {
                newnode = new node(value);
                ptr.left = newnode;
                queue.add(newnode);
            }
            System.out.println("Enter the right node of " + ptr.data);
            value = scanner.nextInt();
            if (value != -1) {
                newnode = new node(value);
                ptr.right = newnode;
                queue.add(newnode);
            }

        }


    }


}


