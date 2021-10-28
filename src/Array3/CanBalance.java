package Array3;
/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one
side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */
public class CanBalance {
    public static void main(String[] args) {
        CanBalance test = new CanBalance();
        int[] x = {1, 1, 1, 2, 1};
        System.out.println(test.canBalance(x));
    }

    public boolean canBalance(int[] nums) {
        int front = 0;
        int back = 0;

        for (int each : nums) {
            back += each;
        }

        for (int each: nums) {
            front += each;
            back -= each;
            if (front == back ) { return true; }
        }

        return false;
    }
}
