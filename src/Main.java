import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
        st.push(55);
        st.push(66);
        String str=st.toString();
        System.out.println(st.search(67));

    }
}
