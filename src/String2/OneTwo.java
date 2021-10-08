package String2;
/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */
public class OneTwo {
    public static void main(String[] args){
        OneTwo test = new OneTwo();
        System.out.println(test.oneTwo("abcdefxy"));
    }

    public String oneTwo(String str) {
        // If string not in the right length - we reduce it.
        int len = str.length();
        if (len % 3 !=0 ) {
            str = str.substring(0, len-(len%3));
        }

        String res = "";
        // Splitting string in 3 equal parts - then rotate and concat into new string
        for (int i=0; i<str.length(); i+=3) {
            String x = str.substring(i, i+3);
            res += (x.substring(1) + x.charAt(0));
        }
        return res;
    }
}
