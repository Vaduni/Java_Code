package Java_Code;

public class Recursion_charOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void Occurence(String str, int idx, char Element) {

        if (idx == str.length()) {
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == Element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        Occurence(str, idx + 1, Element);
    }

    public static void main(String[] args) {
        Occurence("abacddbaacch", 0, 'a');
        System.out.println("first occurence is at " + first);
        System.out.println("Last Occurence is at " + last);
    }
}