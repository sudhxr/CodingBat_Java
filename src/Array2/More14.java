package Array2;
/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
public class More14 {
    public boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;

        for (int each : nums) {
            if (each == 1) { oneCount += 1; }
            if (each == 4) { fourCount += 1; }
        }

        return (oneCount > fourCount);
    }

}
