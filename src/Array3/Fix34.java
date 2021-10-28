package Array3;

import java.util.ArrayList;
import java.util.Arrays;

/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
 immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number
 of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 */

public class Fix34 {
    public static void main(String[] args) {
        Fix34 test = new Fix34();
        int[] x = {1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(test.fix34(x)));
    }

    public int[] fix34(int[] nums) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> emptyStack = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 3) {
                arr[i] = 3;
                arr[i+1] = 4;
            }
            if (nums[i] != 3 && nums[i] != 4) {
                emptyStack.add(nums[i]);
            }
        }

        System.out.println("Stack: " + emptyStack);

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = emptyStack.get(0);
                emptyStack.remove(0);
            }
            System.out.println("Stack: " + emptyStack);
        }

        return arr;
    }
}
