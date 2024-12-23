package Java_Code;

public class Recursion_Keypad_Combination {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void Combination(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        String key = keypad[currentChar - '0'];
        for (int i = 0; i < key.length(); i++) {
            Combination(str, idx + 1, newString + key.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        Combination(str, 0, "");
    }
}
