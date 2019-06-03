package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Graphs|BFS.java| on Mar,2019
 * Happy Coding :)
 */
public class BFS {
    /**
     * graphNodes 2D array for adjacency matrix
     */
    static int graphNodes[][] = new int[6][6];
    static Scanner scanner = new Scanner(System.in);
    static int value;
    static int visited[] = new int[6];
    static int rows = 5, col = 5;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

/**
 * For taking input
 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.println("There is path between " + i + " to " + j);
                value = scanner.nextInt();
                graphNodes[i][j] = value;
            }
        }

        bfsTraversal(1);


    }

    private static void bfsTraversal(int node) {

        System.out.print(node + " ");
        queue.add(node);
        visited[node] = 1;//this ensures that no node will repeat twice
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 1; i <= col; i++) {
                if (graphNodes[v][i] == 1 && visited[i] == 0) {
                    System.out.print(i + " ");
                    visited[i] = 1;
                    queue.add(i);
                }
            }
        }


    }
}
