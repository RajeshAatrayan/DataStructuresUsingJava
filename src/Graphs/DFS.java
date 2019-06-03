package Graphs;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Graphs|DFS.java| on Mar,2019
 * Happy Coding :)
 */

import java.util.Scanner;

/**
 * We need stack to implement it
 */
public class DFS {
    static int graphNodes[][] = new int[6][6];
    static Scanner scanner = new Scanner(System.in);
    static int value;
    static int visited[] = new int[6];
    static int rows = 5, col = 5;

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

        dfsTraversal(1);
    }

    private static void dfsTraversal(int i) {
        if(visited[i]==0){
            System.out.print(i+" ");
            visited[i]=1;

        for(int v=1;v<=col;v++){
            if(graphNodes[i][v]==1){
                dfsTraversal(i);
            }
        }}
    }
}
