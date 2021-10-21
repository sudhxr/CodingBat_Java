package Array2;
/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
public class Has12 {
    public static void main(String[] args) {
        Has12 test = new Has12();
        int[] x = {3, 1, 4, 5, 6};
        System.out.println(test.has12(x));
    }

    public boolean has12(int[] nums) {
        boolean checkForTwo = false;
        boolean twoFound = false;

        for (int each: nums) {
            // one detected
            if (each == 1) {
                checkForTwo = true;
            }
            // check for two
            if (checkForTwo && each == 2) {
                twoFound = true;
            }
        }

        return twoFound;
    }

}
