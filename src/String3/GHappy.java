package String3;
/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */
public class GHappy {
    public static void main(String[] args) {
        GHappy test = new GHappy();
        System.out.println(test.gHappy("gg"));
    }

    // A more elegant solution is definitely possible
    public boolean gHappy(String str) {
        if (str.equals("")) { return true; }
        if (str.length() < 2) { return false; }

        StringBuilder myStr = new StringBuilder(str);
        int gCount = 0;
        int loopCount = 0;

        int index = myStr.indexOf("g");
        while (index != -1 ) {
            loopCount += 1;
            if (index+3<myStr.length() && myStr.substring(index, index + 3).equals("ggg")) {
                gCount += 1;
                myStr.delete(index, index + 3);
            }
            else if (index+2<=myStr.length() && myStr.substring(index, index + 2).equals("gg")) {
                gCount += 1;
                myStr.delete(index, index + 2);
            }
            else {
                myStr.delete(index, index + 1);
            }
            index = myStr.indexOf("g");
        }
        return (loopCount == gCount);
    }
}
