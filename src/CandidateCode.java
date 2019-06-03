/**
 * Created by RajeshAatrayan|JavaDataStructures|PACKAGE_NAME|null.java| on Apr,2019
 * Happy Coding :)
 */

import java.io.*;
import java.util.*;

public class CandidateCode  {

static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {

            int numOfVillians = Integer.parseInt(bufferedReader.readLine());


            for (int j = 0; j < numOfVillians; j++) {

                String villian[] = bufferedReader.readLine().split(" ");
                String player[] = bufferedReader.readLine().split(" ");

                boolean win = false;

                for (int k = 0; k < villian.length; k++) {
                    int v = Integer.parseInt(villian[k]);
                    int p = Integer.parseInt(player[k]);
                    if (p > v) {
                        win = true;
                    } else {
                        win = false;
                        break;
                    }
                }

                if (true) {
                    System.out.println("WIN");
                } else {
                    System.out.println("LOSE");
                }


            }


        }

    }
}