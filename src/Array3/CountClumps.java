package Array3;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */

public class CountClumps {

    public int countClumps(int[] nums) {
        if (nums.length == 0) { return 0; }

        int x = nums[0];
        int preX = -9999;
        int count = 0;
        int outerCount = 0;

        for (int each: nums) {
            if (each == x) {
                count += 1;
                if (count > 1 && x != preX) {
                    outerCount += 1;
                    preX = x;
                }
            }
            else {
                x = each;
                preX = -9999;
                count = 1;
            }
        }

        return outerCount;
    }
}
