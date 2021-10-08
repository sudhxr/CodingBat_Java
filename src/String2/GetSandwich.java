package String2;
/*

A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread" in the given string,
or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */
public class GetSandwich {
    public static void main(String[] args) {
        GetSandwich test = new GetSandwich();
        System.out.println(test.getSandwich("breadAbread"));
    }

    public String getSandwich(String str) {
        String jam = "";
        int first = str.indexOf("bread");
        int second = -1;

        for (int i=first+4; i<str.length()-6; i++) {
            int x = str.indexOf("bread", i);
            if (str.substring(x, x+5).equals("bread") ){
                second = x;
            }
        }

        if (first !=-1 && second !=-1) {
            jam = str.substring(first+5, second);
            return jam;
        }
        return "";
    }

}
