package String2;
/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */
public class PlusOut {
    public static void main(String[] args) {
        PlusOut test = new PlusOut();
        System.out.println(test.plusOut("123123", "3"));
    }

    public String plusOut(String str, String word) {
        String res = "";
        for (int i=0; i<str.length()-(word.length()-1); i++) {
            String xy = str.substring(i, i+(word.length()));
            if (word.equals(xy)) {
                res += xy;
                i+=(word.length()-1);
            }
            else { res += "+"; }
        }

        if ( str.length() == res.length() ) { return res; }
        else {
            int diff = Math.abs(str.length() - res.length());
            for (int i=0; i<diff; i++) { res += "+"; }
            return res;
        }
    }
}
