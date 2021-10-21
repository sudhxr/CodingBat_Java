package Array2;

/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */

import java.util.ArrayList;

public class IsEverywhere {
    public static void main(String[] args) {
        IsEverywhere test = new IsEverywhere();
        int[] x = {2, 1, 2, 1};
        System.out.println(test.isEverywhere(x, 1));
    }

    public boolean isEverywhere(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int each: nums) { arr.add(each); }

        int x = arr.indexOf(val);
        int valCount = 0;
        int valExistCount = 0;

        for (int i=0; i<arr.size(); i++) {
            if (x%2==0 && i%2==0) {
                valCount += 1;
                if (arr.get(i) == val) {
                    valExistCount += 1;
                }
            }

            if (x%2!=0 && i%2!=0) {
                valCount += 1;
                if (arr.get(i) == val) {
                    valExistCount += 1;
                }
            }
        }

        return (valCount == valExistCount);
    }
}
