package SortingTechniques;

/**
 * Created by RajeshAatrayan|JavaDataStructures|SortingTechniques|MergeSort.java| on Mar,2019
 * Happy Coding :)
 */

/**
 * It takes O(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {
        int array[] = {10, 20, 1, 3, 5, 9, 8, 7};
        int beg = 0;
        int end = array.length - 1;
        mergeSort(array, beg, end);
        display(array);
    }

    private static void display(int[] array) {

        for(int i:array){
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] array, int beg, int end) {
        int mid;
        if (beg < end) {//it means we need to apply only when we have atleast two elements
            mid = (beg + end) / 2;
            mergeSort(array, beg, mid);
            mergeSort(array, mid + 1, end);
            merge(array, beg, mid, end);

        }
    }

    private static void merge(int[] array, int beg, int mid, int end) {
        int i = beg, j = mid + 1, index = beg;//here index must be equal to beg since beg varry at each stage of mergeSort
        int temp[] = new int[10];//we are making temp array

        while (i <= mid && j <= end) {

            if (array[i] < array[j]) {
                temp[index] = array[i];
                i++;
            } else {
                temp[index] = array[j];
                j++;
            }
            index++;
        }

        if (i > mid) {
            while (j <= end) {
                temp[index] = array[j];
                j++;
                index++;
            }
        }
        if (j > end) {
            while (i <= mid) {
                temp[index] = array[i];
                i++;
                index++;
            }
        }

        /**
         * here we took k=beg because k varies from stage to stage and in the above loop index increments a step a head so we just write <index

         */

        for (int k = beg; k < index; k++) {
            array[k] = temp[k];
        }

    }
}
