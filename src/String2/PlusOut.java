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
        int i = 0;

        while(i < str.length()) {
            if(i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                res += word;
                i += word.length();
            } else {
                res += "+";
                i++;
            }
        }

        return res;
    }
}
