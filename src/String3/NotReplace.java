package String3;
/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"

 */
public class NotReplace {
    public static void main(String[] args) {
        NotReplace test = new NotReplace();
        System.out.println(test.notReplace("is-is"));
    }

    public String notReplace(String str) {
        String res = "";

        for (int i=0; i<=str.length()-1; i++) {

            if ( ( i==0 || !Character.isLetter(str.charAt(i-1)) )
                    && ( str.substring(i, i+2).equals("is") )
                    && ( i==str.length()-2 || !Character.isLetter(str.charAt(i+2))) ) {
                res += str.substring(i, i+2) + " not";
                i = i+1;
            }

            else { res += str.charAt(i); }
        }

        return res;
    }

}
