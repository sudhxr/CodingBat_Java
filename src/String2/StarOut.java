package String2;
/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */
public class StarOut {

    public static void main(String[] args) {
        StarOut test = new StarOut();
        //System.out.println(test.starOut("aaa*bbb*ccc*ddde"));
        System.out.println(test.starOut("ab**cd"));
        //System.out.println(test.starOut("ab*cd"));
        //System.out.println(test.starOut("*"));
    }

    // ## The solution for this problem can be improved ##
    public String starOut(String str) {

        if(str.length() <= 1) {
            if(str.equals("*")) { return ""; }
            return str;
        }

        if (str.indexOf("*") == str.length()-1) { return str.substring(0, str.length()-2); }

        String res = "";
        // reducing multiple stars --------------------
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '*' && str.charAt(i+1) == '*' && str.charAt(i+2) == '*') {
                res += str.charAt(i) + "";
                i = i+2;
            }
            else if (str.charAt(i) == '*' && str.charAt(i+1) == '*') {
                res += str.charAt(i) + "";
                i = i+1;
            }
            else {
                res += str.charAt(i);
            }
        }

        //System.out.println("After * reduction: " + res);

        while(res.indexOf('*')!=-1) {
            int star = res.indexOf("*");
            if (star == 0) { res = res.substring(2); }
            else {
                res = (res.substring(0, star - 1) + res.substring(star + 2));
            }
        }

        return res;
    }
}
