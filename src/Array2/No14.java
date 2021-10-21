package Array2;
/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */
public class No14 {
    public boolean no14(int[] nums) {

        int oneCount = 0;
        int fourCount = 0;

        for (int each : nums) {
            if (each == 1) { oneCount += 1; }
            if (each == 4) { fourCount += 1; }
        }

        return ((oneCount > 0 ^ fourCount > 0) || (oneCount == 0 && fourCount == 0));
    }
}
