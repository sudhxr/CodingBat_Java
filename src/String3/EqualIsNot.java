package String3;
/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */
public class EqualIsNot {
    public static void main(String[] args) {
        EqualIsNot test = new EqualIsNot();
        System.out.println(test.equalIsNot("isnotis"));
    }

    public boolean equalIsNot(String str) {
        return (wordCount(str, "is") == wordCount(str, "not"));
    }

    public int wordCount(String str, String word) {
        int count = 0;
        for (int i=0; i<(str.length()-(word.length() - 1)); i++) {
            if (str.substring(i, i+(word.length())).equals(word)) {
                count += 1;
            }
        }
        return count;
    }

    /*
      public boolean equalIsNot(String str) {
      int is = 0;
      int not = 0;
      for (int i=0; i<str.length()-1; i++) {
          //System.out.println("x: " + str.substring(i, i+2));
          if (str.substring(i, i+2).equals("is")) {
              is += 1;
          }
      }

      for (int i=0; i<str.length()-2; i++) {
          //System.out.println("y: " + str.substring(i, i + 3));
          if (str.substring(i, i + 3).equals("not")) {
              not += 1;
          }
      }

      return (not == is);
    }
    */
}
