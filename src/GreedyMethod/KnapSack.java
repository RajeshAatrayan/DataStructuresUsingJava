package GreedyMethod;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by RajeshAatrayan|JavaDataStructures|GreedyMethod|KnapSack.java| on Apr,2019
 * Happy Coding :)
 */
public class KnapSack {
    public static void main(String[] args) {
        int bagCapacity = 15;
        int objects[] = {1, 2, 3, 4, 5, 6, 7};
        int profit[] = {10, 5, 15, 7, 6, 18, 3};
        int weight[] = {2, 3, 5, 7, 1, 4, 1};
        //the above mentioned things will be given

        //step1:we need to calculate the p/w;
        ArrayList<Integer> list = new ArrayList<>(profit.length);
        for (int i = 0; i < profit.length; i++) {
            list.add(profit[i] / weight[i]);
        }
        int profitMade = 0;
        int fl[] = new int[profit.length];
        while (bagCapacity > 0) {
            int getMax = Collections.max(list);
            int index = list.indexOf(getMax);
            list.set(index, 0);
            int currWeight = weight[index];
            if (currWeight <= bagCapacity) {
                fl[index] = 1;
            } else {
                fl[index] = bagCapacity / currWeight;
            }

            bagCapacity -= currWeight;
            profitMade += (fl[index] * profit[index]);

        }
        System.out.println("Total profit made " + profitMade);


    }
}
