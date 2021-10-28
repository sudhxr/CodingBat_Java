package Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMirror {
    public static void main(String[] args) {
        MaxMirror test = new MaxMirror();
        int[] x = {1, 2, 1};
        System.out.println(test.maxMirror(x));
    }

    public int maxMirror(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> revArr = new ArrayList<Integer>();

        for (int each: nums) {
            arr.add(each);
            revArr.add(each);
        }
        Collections.reverse(revArr);

        if (arr.equals(revArr)) {
            return arr.size();
        }
        System.out.println("Test" + arr);
        System.out.println("Test" + revArr);

        return -1;
    }

}
