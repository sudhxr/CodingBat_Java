package Array2;

import java.util.Arrays;

public class Post4 {
    public static void main(String[] args) {
        Post4 test = new Post4();
        int[] x = {4, 1, 4, 2};
        System.out.println(Arrays.toString(test.post4(x)));
    }

    public int[] post4(int[] nums) {

        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 4) {
                index = i;
            }
        }

        int[] arr = new int[(nums.length) - (index+1)];

        for (int i=0; i<arr.length; i++) {
            arr[i] = nums[index + 1];
            index += 1;
        }

        return arr;
    }

}
