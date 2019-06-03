package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Trees|null.java| on Apr,2019
 * Happy Coding :)
 */
public class LeftViewBinaryTree {
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

    static node root, newnode, ptr;
    static Queue<node> queue = new LinkedList<>();

    public static void main(String[] args) {
        String str = "10 20 L 10 30 R 20 40 L 20 60 R";
        String sinp[] = str.split(" ");
        root = new node(Integer.parseInt(sinp[0]));
        queue.add(root);
        int i = -1;
        while (!queue.isEmpty() && i < str.length()) {
            ptr = queue.poll();
            i = i + 3;
            if (i >= sinp.length) break;
            String ch = sinp[i];
            int val;
            if (ch.equals("L")) {
                val = Integer.parseInt(sinp[i - 1]);
                newnode = new node(val);
                ptr.left = newnode;
                queue.add(newnode);
            } else {
                val = Integer.parseInt(sinp[i - 1]);
                newnode = new node(val);
                ptr.right = newnode;
                queue.add(newnode);
            }
            i = i + 3;
            if (i >= sinp.length) break;
            ch = sinp[i];
            if (ch.equals("R")) {
                val = Integer.parseInt(sinp[i - 1]);
                newnode = new node(val);
                ptr.right = newnode;
                queue.add(newnode);
            } else {
                val = Integer.parseInt(sinp[i - 1]);
                newnode = new node(val);
                ptr.left = newnode;
                queue.add(newnode);
            }


        }

        ptr = root;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.left;
        }


    }
}
