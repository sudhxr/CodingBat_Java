package String3;
/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string.
The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */

public class CountTriple {
    public int countTriple(String str) {
        if (str.length() < 3) { return 0; }

        int count = 0;
        for (int i=0; i<str.length()-2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                count +=1;
            }
        }
        return count;
    }
}
