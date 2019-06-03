package Heaps;

/**
 * Created by RajeshAatrayan|JavaDataStructures|Heaps|null.java| on Mar,2019
 * Happy Coding :)
 */
public class HeapifyArray {

    public static void main(String[] args) {
        int aray[] = {0,1, 5, 6, 7, 8, 9, 10};

        heapify(aray);
        display(aray);
    }

    private static void display(int[] aray) {
        for(int i=1;i<aray.length;i++){
            System.out.print(aray[i]+" ");
        }
    }

    private static void heapify(int[] aray) {
        int bound = aray.length - 1;
        int j;
        int swapf;
        for (int i = bound; i >= 1; i--) {
               j=i*2;
               int x=i;
                while (j<=bound){
                    if (aray[j + 1] > aray[j]) {
                           j = j + 1;
                       }
                        int temp = aray[x];
                       aray[x] = aray[j];
                       aray[j] = temp;
                       x = j;
                       j = j * 2;
                   }


        }
    }
}
