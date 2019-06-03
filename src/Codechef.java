import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by RajeshAatrayan|JavaDataStructures|PACKAGE_NAME|Codechef.java| on Apr,2019
 * Happy Coding :)
 */
public class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bufferedReader.readLine());

        String str[] = bufferedReader.readLine().split(" ");
        HashSet<String> slist = new HashSet<>(Arrays.asList(str));
        Iterator<String> stringIterator = slist.iterator();
        Integer ar[] = new Integer[slist.size()];
        int i = 0;
        while (stringIterator.hasNext()) {
            ar[i] = Integer.parseInt(stringIterator.next());
            i++;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int k = 0; k < ar.length; k++) {

          set.add(ar[k]%ar[0]);

//            for (int j = 1; j < ar.length; j++) {
//                set.add(ar[j]%ar[k]);
//            }
        }

        if(ar.length==1)
            set.add(ar[ar.length-1]);
        else set.add(ar[ar.length-2]);
        System.out.println(set.last());


    }
}
