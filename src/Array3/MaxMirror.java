package Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMirror {
    public static void main(String[] args) {
        MaxMirror test = new MaxMirror();
        int[] x = {1, 2, 1, 4};
        System.out.println(test.maxMirror(x));
    }

    public int maxMirror(int[] nums) {
        int max = 0;

        for (int i=0; i<nums.length; i++) {
            int count = 0;
            for (int j=nums.length-1; j>=0 && i + count < nums.length; j--) {
                if (nums[j] == nums[i + count]) {
                    count += 1;
                }
                else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }

}
