package Array2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int[] arr = new int[nums.length];

        for (int outer=0; outer<arr.length; outer++) {
            if (nums[outer] == 0) {
                int x = rightOdd(outer, nums);
                if (x == -1 ) { arr[outer] = 0; } // odd not found
                else          { arr[outer] = x; } // odd found
            }
            else {
                arr[outer] = nums[outer];
            }
        }
        return arr;
    }

    public int rightOdd(int index, int[] nums) {
        int oddMax = -1;
        for (int i=index; i<nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddMax = Math.max(nums[i], oddMax);
            }
        }
        return oddMax;
    }
}
