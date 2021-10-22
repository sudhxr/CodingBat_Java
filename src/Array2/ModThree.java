package Array2;
/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */
public class ModThree {
    public boolean modThree(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;

        for (int each: nums) {
            if (each % 2==0) { // even counter
                evenCount += 1;
                oddCount = 0;
            }
            else { // odd counter
                oddCount += 1;
                evenCount = 0;
            }

            if (evenCount == 3 || oddCount == 3) { return true; }
        }

        return false;
    }
}
