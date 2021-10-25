package Array2;
/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */

public class TenRun {
    public int[] tenRun(int[] nums) {
        int[] arr = new int[nums.length];

        boolean start = false;
        int writer = -1;

        for (int i=0; i<nums.length; i++) {
            int x = nums[i];

            if (x%10 == 0) { // Multiple of 10 confirmed
                start = true;
                writer = x;
            }

            if (start) { arr[i] = writer; }
            else       { arr[i] = x; }

        }

        return arr;
    }
}
