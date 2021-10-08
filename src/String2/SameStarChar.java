package String2;
/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */
public class SameStarChar {
    public static void main(String[] args) {
        SameStarChar test = new SameStarChar();
        System.out.println(test.sameStarChar("**"));
    }

    public boolean sameStarChar(String str) {
        if (str.length() < 3) { return true; }

        int star = str.lastIndexOf("*", str.length()-2);
        if (star == -1) { return true; } //Star do not exist

        char before = str.charAt(star-1);
        char after = str.charAt(star+1);

        return (before == after) ;
    }
}
