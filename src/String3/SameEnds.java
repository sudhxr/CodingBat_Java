package String3;
/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */
public class SameEnds {

    public String sameEnds(String string) {
        String res = "";

        for (int i=0; i<string.length(); i++) {
            String x = string.substring(0, i);
            if ( i<=(string.length()/2) && string.endsWith(x) ) {
                res = x;
            }
        }

        return res;
    }
}
