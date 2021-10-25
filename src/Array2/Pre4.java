package Array2;
/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come
before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in
java to create an array of length 0.


pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Pre4 {
    public static void main(String[] args) {
        Pre4 test = new Pre4();
        int[] x = {1, 2, 4, 1};
        System.out.println(Arrays.toString(test.pre4(x)));
    }

    public int[] pre4(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i=0;
        while(nums[i] != 4) {
            arr.add(nums[i]);
            i+= 1;
        }

        int[] fArr = new int[arr.size()];
        for (int j=0; j<arr.size(); j++) {
            fArr[j] = arr.get(j);
        }

        return fArr;
    }
}
