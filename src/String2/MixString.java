package String2;
/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
public class MixString {
    public String mixString(String a, String b) {
        int len = Math.min(a.length(), b.length());
        String res = "";

        for (int i=0; i<len; i++) {
            res += a.charAt(i) + "" + b.charAt(i);
        }

        if (a.length() > b.length()) { res+=a.substring(len); }
        else { res+=b.substring(len); }
        return res;
    }

}
