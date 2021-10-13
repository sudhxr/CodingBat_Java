package String3;
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */

public class MirrorEnds {
    public static void main (String[] args) {
        MirrorEnds test = new MirrorEnds();
        System.out.println(test.mirrorEnds("abXYZba"));
    }

    public String mirrorEnds(String string) {
        if (string.endsWith( new StringBuilder(string).reverse().toString() )) {
            return string;
        }

        String res = "";

        for (int i=0; i<string.length(); i++) {
            String x = string.substring(0, i);
            if ( i<=(string.length()/2) && string.endsWith(new StringBuilder(x).reverse().toString()) ) {
                res = x;
            }
        }

        return res;
    }
}
