package Array2;
/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int[] arr = new int[nums.length];
        if (nums.length==0) { return arr; }

        for (int i=1; i<nums.length; i++) {
            arr[i-1] = nums[i];
        }

        arr[nums.length-1] = nums[0];

        return arr;
    }

}
