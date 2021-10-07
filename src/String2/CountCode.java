package String2;
/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for (int i=0; i<str.length()-3; i++) {
            //String x = str.charAt(i) + "" + str.charAt(i+1) + "" + str.charAt(i+3);
            //if (x.equals("coe") ) { count +=1; }
            if (str.charAt(i) == 'c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e' ) {
                count += 1;
            }
        }
        return count;
    }

}
