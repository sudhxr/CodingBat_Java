package String3;
/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2

 */
public class CountYZ {

    public static void main(String[] args) {
        CountYZ test = new CountYZ();
        System.out.println(test.countYZ("!!day--yaz!!"));
    }

    public int countYZ(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder(str);

        for (int i=0; i<sb.length(); i++) {
            if ( !Character.isLetter(sb.charAt(i)) ) {
                sb.replace(i, i+1, " ");
            }
        }

        //System.out.println("SB: " + sb);
        str = sb.toString();
        String[] arrStr = str.split(" ");

        for (int i=0; i<arrStr.length; i++) {
            String x = arrStr[i].toLowerCase();
            //System.out.println("X: " + x);
            if (x.endsWith("z") || x.endsWith("y")) {
                count += 1;
            }
        }
        return count;
    }
}
