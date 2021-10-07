package String2;
/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */
public class BobThere {
    public boolean bobThere(String str) {
        // The commented code can be improved, fails one test case
        //int index = str.indexOf("b");
        //return ( str.length()>2 && str.charAt(index + 2) == 'b' );

        for (int i=0; i<str.length()-2; i++) {
            if (str.charAt(i)=='b' && str.charAt(i+2)=='b') {
                return true;
            }
        }
        return false;

    }

}
