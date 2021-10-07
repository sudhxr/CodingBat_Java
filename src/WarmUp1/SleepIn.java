package WarmUp1;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 */

public class SleepIn {
    public static void main(String args[]) {
        SleepIn test = new SleepIn();
        System.out.println(test.sleepIn(false, false)); // Expect true
        System.out.println(test.sleepIn(true, false)); // Expect false
        System.out.println(test.sleepIn(false, true)); // Expect true
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}


