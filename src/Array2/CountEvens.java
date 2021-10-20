package Array2;
/*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */
public class CountEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int x : nums) {
            if (x%2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
