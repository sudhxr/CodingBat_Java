package WarmUp1;
/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"

 */
public class EndUp {
    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        else {
            String upperString = str.substring(str.length()-3).toUpperCase();
            return str.substring(0, str.length()-3) + upperString;
        }
    }

}
