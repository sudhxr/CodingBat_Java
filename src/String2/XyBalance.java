package String2;
/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
public class XyBalance {
    public boolean xyBalance(String str) {
        int idx = -1;
        int idy = -1;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'x') { idx = i; }
            if (str.charAt(i) == 'y') { idy = i; }
        }

        return  (idy >= idx);
    }

}
