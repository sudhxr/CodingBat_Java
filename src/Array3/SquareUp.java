package Array3;

import java.util.Arrays;

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
