package String3;

public class SumDigits {
    public static void main(String[] args){
        SumDigits test = new SumDigits();
        System.out.println(test.sumDigits("aa11b33"));
    }

    public int sumDigits(String str) {
        if (str.equals("")) { return 0; }
        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
            //System.out.println(str.charAt(i));
        }
        return sum;
    }
}
