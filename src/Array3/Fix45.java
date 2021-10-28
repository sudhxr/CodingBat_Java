package Array3;

import java.util.ArrayList;

public class Fix45 {
    public int[] fix45(int[] nums) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> emptyStack = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 4) {
                arr[i] = 4;
                arr[i+1] = 5;
            }
            if (nums[i] != 4 && nums[i] != 5) {
                emptyStack.add(nums[i]);
            }
        }

        //System.out.println("Stack: " + emptyStack);

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = emptyStack.get(0);
                emptyStack.remove(0);
            }
            //System.out.println("Stack: " + emptyStack);
        }

        return arr;
    }
}
