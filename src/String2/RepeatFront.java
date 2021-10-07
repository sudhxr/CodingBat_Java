package String2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String res = "";
        int len = n;
        for (int i=0; i<len; i++) {
            res += str.substring(0, n);
            n-=1;
        }

        return res;
    }

}
