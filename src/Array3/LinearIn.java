package Array3;

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers
 in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage
 of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */

import java.util.ArrayList;

public class LinearIn {
    public static void main(String[] args) {
        LinearIn test = new LinearIn();
        int[] outer = {2, 2, 2, 2, 2};
        int[] inner = {2, 4};
        System.out.println(test.linearIn(outer, inner));
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int index = 0;
        int count = 0;
        for (int each: outer) {
            if (index < inner.length && each == inner[index]) {
                index += 1;
                count += 1;
            }
        }

        System.out.println("Count: " + count);
        System.out.println("Inner len: " + inner.length);
        return count >= (inner.length);

        //if (inner.length == 0) { return true; }
        /*ArrayList<Integer> innerStack = new ArrayList<Integer>();

        for (int each : inner) {
            innerStack.add(each);
        }

        for (int each: outer) {
            if (innerStack.size() != 0 && each == innerStack.get(0)) {
                innerStack.remove(0);
            }
        }

        return (innerStack.size() == 0);
         */
    }

}
