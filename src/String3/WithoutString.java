package String3;
/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"

 */
public class WithoutString {
    public static void main(String[] args) {
        WithoutString test = new WithoutString();
        System.out.println(test.withoutString("MkjtMkx", "Mk") );
    }

    public String withoutString(String base, String remove) {
        StringBuilder sb = new StringBuilder(base);
        System.out.println("before: " + sb);

        sb = removeInd(sb, remove);
        sb = removeInd(sb, remove.toLowerCase());
        sb = removeInd(sb, remove.toUpperCase());

        System.out.println("after: " + sb);
        return sb.toString();
    }

    public StringBuilder removeInd(StringBuilder sb, String remove) {
        int index = sb.indexOf(remove);
        while (index != -1) {
            sb.delete(index, index + (remove.length()));
            index = sb.indexOf(remove);
        }
        return sb;
    }
}
