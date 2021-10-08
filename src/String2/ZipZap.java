package String2;
/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */
public class ZipZap {
    public static void main(String[] args) {
        ZipZap test = new ZipZap();
        System.out.println(test.zipZap("zp"));
    }

    public String zipZap(String str) {

        if (str.length() < 3) { return str; }

        String res = "";
        for (int i=0; i<=str.length()-1; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                res += str.charAt(i) + "" + str.charAt(i+2);
                i = i + 2;
            }
            else {
                res += str.charAt(i) + "";
            }
        }
        return res;
    }
}
