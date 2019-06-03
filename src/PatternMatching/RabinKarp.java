package PatternMatching;

/**
 * Created by RajeshAatrayan|JavaDataStructures|PatternMatching|null.java| on Mar,2019
 * Happy Coding :)
 */
public class RabinKarp {
    static int prime = 101;
    static int textHash;
    static int patternL;

    public static void main(String[] args) {
        String text = "abedabc";
        String pattern = "abc";
        patternL = pattern.length() - 1;
        int textLength = text.length();
        int patternLength = pattern.length();
       int patternHash = calculatePattern(pattern, patternLength - 1);
      textHash = calculatePattern(text, patternLength - 1);

        if (patternHash == textHash) {
            boolean bool = stringAreEqual(pattern, text, 0);
           if(bool) System.out.println("Pattern Exists at " + 0);
        } else {

            for (int i = 1; i <= textLength - patternLength ; i++) {
                //we need text,old-char value,newchar value


                textHash = recalcualteHash(text, i - 1, i+patternLength-1);
                System.out.println(text.charAt(i)+" "+patternHash+" "+textHash);
                if(patternHash==textHash) System.out.println("Pattern Exists at "+i);


            }
        }


    }

    private static int recalcualteHash(String text, int old, int newval) {
        int x = ((textHash - (int) text.charAt(old)) / prime);
        int addIt = (int) ((int) (text.charAt(newval)) * Math.pow(prime, patternL));
        textHash = x + addIt;
        return textHash;
    }

    private static boolean stringAreEqual(String pattern, String text, int i) {
        String str = text.substring(i, pattern.length() + i);
        if (pattern.equals(str)) return true;
        return false;
    }

    private static int calculatePattern(String pattern, int n) {
        int hash = 0;
        int ch;
        for (int i = 0; i <= n; i++) {
            ch = pattern.charAt(i);
            hash = (int) (hash + (ch * Math.pow(prime, i)));
        }
        return hash;
    }

}
