package String2;
/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */
public class PrefixAgain {
    public static void main(String[] args) {
        PrefixAgain test = new PrefixAgain();
        System.out.println(test.prefixAgain("abXYabc", 1)); // true
        //System.out.println(test.prefixAgain("abXYabc", 2)); // true
        //System.out.println(test.prefixAgain("abXYabc", 3)); // false
    }
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        //System.out.println("Prefix: " + prefix);
        String testString = str.substring(n);
        //System.out.println("TestString: " + testString);
        for (int i=0; i<=testString.length()-n; i++) {
            if ( prefix.equals(testString.substring(i, i+n))) {
                return true;
            }
        }
        return false;
    }

}
