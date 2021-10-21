package Array2;

import java.util.ArrayList;
import java.util.Collections;

/*

Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class CenteredAverage {
    public static void main(String[] args) {
        CenteredAverage test = new CenteredAverage();
        int[] x = {1, 1, 99, 99};
        System.out.println(test.centeredAverage(x));
    }
    public int centeredAverage(int[] nums) {
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        // copying the array
        for (int i : nums) { myArr.add(i); }

        // Sorting the array
        Collections.sort(myArr);

        // remove the smallest and largest
        int first = myArr.get(0);
        myArr.remove(0);
        int last = myArr.get(myArr.size()-1);
        myArr.remove(myArr.size()-1);

        // Finding the sum
        int sum = getSum(myArr);
        int x = ( sum - myArr.get(myArr.size()-1) - myArr.get(0) );
        int y = (myArr.size() - 2);

        if (x==0 || y==0) {
            myArr.add(0, first);
            myArr.add(last);
            sum = getSum(myArr);
            x = ( sum - myArr.get(myArr.size()-1) - myArr.get(0) );
            y = (myArr.size() - 2);
        }

        return x / y;
    }

    public int getSum(ArrayList<Integer> myArr) {
        int sum = 0;
        for(int d : myArr) { sum += d; }
        return sum;
    }

}
