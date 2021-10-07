package String2;
/*

Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */
public class XyzMiddle {
    public static void main(String[] args) {
        XyzMiddle test = new XyzMiddle();
        //System.out.println(test.xyzMiddle("AxyzBBB")); // false
        //System.out.println(test.xyzMiddle("AxyzBB")); // true
        System.out.println(test.xyzMiddle("AxyzBBBB"));

    }
    public boolean xyzMiddle(String str) {
        if (str.length() < 3) { return false; }
        if (str.equals("xyz")) { return true;}

        String left = "";
        String right = "";

        for (int i=0; i<str.length()-3; i++) {
            String x = str.substring(i, i+3);
            //System.out.println(x);
            if (x.equals("xyz")) {
                left = str.substring(0, i);
                right = str.substring(i+3);
                if (Math.abs(left.length()-right.length()) <=1) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean xyzMiddle_V2(String str) {

        if (str.length() < 3) { return false; }
        if (str.equals("xyz")) { return true;}

        int mid = str.length()/2;
        String left = "";
        String right = "";

        if (str.substring(mid-1, mid+2).equals("xyz")) {
            System.out.println("mid: " + str.substring(mid - 1, mid + 2));
            left = str.substring(0, mid-1);
            right = str.substring(mid+2);
        }
        else if (str.substring(mid-2, mid+1).equals("xyz")) {
            System.out.println("mid-1: " + str.substring(mid - 2, mid + 1));
            left = str.substring(0, mid-2);
            right = str.substring(mid+1);
        }
        else if (str.substring(mid, mid+3).equals("xyz")) {
            System.out.println("mid+1: " + str.substring(mid, mid + 3));
            left = str.substring(0, mid);
            right = str.substring(mid+3);
        }
        System.out.println(left+ "<-->" + right);
        return (left.length()!=0 || right.length()!=0) && (Math.abs(left.length() - right.length()) <= 1 ) ;

    }

}
