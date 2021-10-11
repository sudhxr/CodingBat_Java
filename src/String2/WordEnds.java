package String2;
/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */
public class WordEnds {

    public static void main(String[] args) {
        WordEnds test = new WordEnds();
        System.out.println(test.wordEnds("abcXY123XYijk", "XY"));
    }

    public String wordEnds(String str, String word) {

        if (str.length() <= word.length()) { return ""; }

        String res = "";
        int index = str.indexOf(word);

        while (index != -1) {
            if (index == 0) {
                res += "" + str.charAt(index + word.length());
            }
            else if (index+word.length() == str.length()) {
                res += str.charAt(index - 1) + "";
            }
            else {
                res += str.charAt(index - 1) + "" + str.charAt(index + word.length());
            }

            index = str.indexOf(word, index+1);
        }

        return res;
    }

}
