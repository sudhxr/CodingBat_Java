package Array2;
/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */
public class TwoTwo {
    public static void main(String[] args) {
        TwoTwo test = new TwoTwo();
        int[] x = {2};
        System.out.println(test.twoTwo(x));
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2) { return false;}

        boolean res = true;
        for (int i=0; i<nums.length-1; i++) {
            if (i+1 == nums.length-1 && nums[i+1] == 2) {
                res = false;
            }
            if (nums[i]==2 && nums[i+1]==2) {
                res = true;
                i = i + 1;
            }
            else if (nums[i]==2 && nums[i+1]!=2) {
                res = false;
            }
        }
        return res;
    }
}
