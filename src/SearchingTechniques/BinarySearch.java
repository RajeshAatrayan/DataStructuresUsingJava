package SearchingTechniques;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by RajeshAatrayan|JavaDataStructures|SearchingTechniques|BinarySearch.java| on Mar,2019
 * Happy Coding :)
 */
public class BinarySearch {
    /**
     * For binarysearch the elements needs to be in  sorted order
     * it takes O(logn)
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = {10, 20, 1, 3, 5, 9, 8, 7};
        Arrays.sort(array);

        System.out.println("Eneter the element you want to search");
        int value = scanner.nextInt();
        int beg=0,end=array.length-1;
        int mid;
        int found=0;
        while(beg<=end){
            mid=(beg+end)/2;
            if (array[mid]==value){
                found=1;
                System.out.println("Element found at index "+mid);
                break;
            }else if(array[mid]>value){
                end=mid-1;
            }else {
                beg=mid+1;
            }
        }

        if(found==0){
            System.out.println("Element not found");
        }

    }

}
