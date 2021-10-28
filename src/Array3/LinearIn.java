package Array3;

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers
 in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage
 of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */

public class LinearIn {
    public static void main(String[] args) {
        LinearIn test = new LinearIn();
        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 4};
        System.out.println(test.linearIn(outer, inner));
    }

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) { return true; }

        int index = 0;
        boolean check = true;

        for (int i=0; i<outer.length; i++) {
            if (outer[i] == inner[index] && i<=(outer.length - inner.length) ) {
                int count = 0;
                for (int j=0; j<inner.length; j++) {
                    if (inner[j] == outer[i+j]) {
                        count += 1;
                    }
                }
                if (count == inner.length) {
                    return true;
                }
            }
        }

        return false;
    }

}
