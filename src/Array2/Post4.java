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

        System.out.println("Index: " + index);

        int[] arr = new int[(nums.length) - (index+1)];
        int x = 0;
        for (int i = index + 1; i<nums.length; i++) {
            System.out.println("i: "+ nums[i]);
            arr[x] = nums[i];
            x += 1;
        }

        return arr;
    }

}
