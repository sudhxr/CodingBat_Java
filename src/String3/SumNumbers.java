package String3;
/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SumNumbers {
    public static void main(String[] args) {
        SumNumbers test = new SumNumbers();
        System.out.println(test.sumNumbers("5$$1;;1!!"));
    }

    public int sumNumbers(String str) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        String x = "";

        for (int i=0; i<=str.length()-1; i++) {
            char curr = str.charAt(i);

            if (Character.isDigit(curr)) {  x += "" + curr; }

            if ( ( i==str.length()-1 || !Character.isDigit(curr) ) && !x.equals("") ) {
                numList.add(Integer.parseInt(x));
                x = "";
            }
        }

        int sum=0;
        for (int each: numList)
            sum += each;
        return sum;
    }
}
