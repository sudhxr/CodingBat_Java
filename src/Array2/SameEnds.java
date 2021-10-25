package Array2;

import java.util.Arrays;

/*
Return true if the group of N numbers at the start and end of the array are the same.
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false

 */
public class SameEnds {
    public static void main(String[] args) {
        SameEnds test = new SameEnds();
        int[] x = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(test.sameEnds(x, 2));
    }

    public boolean sameEnds(int[] nums, int len) {
        int[] front = new int[len];
        int[] back = new int[len];

        for (int i = 0; i < len; i++) {
            front[i] = nums[i];
            back[i] = nums[(nums.length) - (len-i)];
        }

        return Arrays.equals(front, back);
    }
}
