package Java_Code;

public class Recursion_Print_Subsequence {
    public static void subSequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        // to be in sequence
        subSequences(str, idx + 1, newString + currentChar);
        // not to be in sequence
        subSequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");
    }
}
