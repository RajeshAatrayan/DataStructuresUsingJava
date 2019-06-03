package Trees;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|Trees|JavaDataStructures| on Mar,2019
 * Happy Coding :)
 */
public class BinarySearchTree {
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

    static node newnode, ptr, root, preptr;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Enter 1 to insert into BST");
            System.out.println("Enter 2 for inorder traversal BST");
            System.out.println("Enter 3 for preorder traversal BST");
            System.out.println("Enter 4 for postorder traversal BST");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertIntoBst();
                    break;
                case 2:
                    inorderTraversalOfBst(root);
                    break;
                case 3:
                    preorderTraversalOfBst(root);
                    break;
                case 4:
                    postorderTraversalOfBst(root);
                    break;
            }
        } while (option <= 4);


    }

    private static void postorderTraversalOfBst(node root) {
        if (root != null) {
            postorderTraversalOfBst(root.left);
            postorderTraversalOfBst(root.right);
            System.out.print(root.data);
        }
    }

    private static void preorderTraversalOfBst(node root) {
        if (root != null) {
            System.out.print(root.data);
            preorderTraversalOfBst(root.left);
            preorderTraversalOfBst(root.right);
        }
    }

    private static void inorderTraversalOfBst(node root) {
        if (root != null) {

            inorderTraversalOfBst(root.left);
            System.out.print(root.data);
            inorderTraversalOfBst(root.right);
        }
    }

    /**
     * To insert into BST
     */
    private static void insertIntoBst() {
        System.out.println("Enter the node value");
        int value = scanner.nextInt();
        if (root == null) {
            newnode = new node(value);
            root = newnode;
        } else {
            ptr = root;
            preptr = null;
            while (ptr != null) {
                preptr = ptr;
                if (value == ptr.data) return;
                else if (value < ptr.data) {
                    ptr = ptr.left;
                } else ptr = ptr.right;
            }
            /**
             * By this time preptr will be holding the node after which we need insert the current node
             */
            newnode = new node(value);
            if (value < preptr.data) {
                preptr.left = newnode;
            } else {
                preptr.right = newnode;
            }
        }

    }
}
