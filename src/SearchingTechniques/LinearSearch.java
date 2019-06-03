package SearchingTechniques;

import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|SearchingTechniques|LinearSearch.java| on Mar,2019
 * Happy Coding :)
 */
public class LinearSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = {10, 20, 1, 3, 5, 9, 8, 7};
        System.out.println("Enter the element you want to search");
        int found = 0;
        int value = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Element found at pos " + i);
                found = 1;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }
    }
}
