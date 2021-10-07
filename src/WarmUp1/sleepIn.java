package WarmUp1;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 */

public class sleepIn {
    public static void main(String args[]) {
        sleepIn test = new sleepIn();
        System.out.println(test.sleep(false, false)); // Expect true
        System.out.println(test.sleep(true, false)); // Expect false
        System.out.println(test.sleep(false, true)); // Expect true
    }

    public boolean sleep(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}


