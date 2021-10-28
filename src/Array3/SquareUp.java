package Array3;

import java.util.Arrays;
/*
Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class SquareUp {
    public static void main(String[] args) {
        SquareUp test = new SquareUp();
        System.out.println(Arrays.toString(test.squareUp(3)));
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n*n];
        int index = 0;
        int extra = 1;

        for (int i=0; i<n; i++) {
            for (int j=n; j>0; j--) {
                if (j <= extra) { arr[index] = j; }
                index += 1;
            }
            extra = extra + 1;
        }

        return arr;
    }

}
