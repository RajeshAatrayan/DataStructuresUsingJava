package Trees;

import java.util.*;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Trees|null.java| on Mar,2019
 * Happy Coding :)
 */
public class DiameterOfTree {
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
    static TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Enter 1 to insert into Binary Tree");
            System.out.println("Enter 2 to find the diameter");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertIntoBinaryTree();
                    break;
                case 2:
                    int dia = TreeDiameter(root);
                    System.out.println(dia);
                    break;

            }


        } while (option <= 1);

    }

    private static int TreeDiameter(node root) {
        queue.clear();
        queue.add(root);
        while (!queue.isEmpty()) {
            ptr = queue.poll();
            int h = findHeightOf(ptr, true);
            treeSet.add(h);
            if (ptr.left != null) queue.add(ptr.left);
            if (ptr.right != null) queue.add(ptr.right);
        }
        return treeSet.first();
    }

    private static int findHeightOf(node ptr, boolean bool) {
        int x, y;
        if (ptr != null) {
            x = findHeightOf(ptr.left, false);
            y = findHeightOf(ptr.right, false);

            if (bool) {

                return x + y + 1;

            }
            if (x > y) return x + 1;
            else return y + 1;
        }
        return 0;
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
