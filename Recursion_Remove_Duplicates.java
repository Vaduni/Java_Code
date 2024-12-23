package Java_Code;

public class Recursion_Remove_Duplicates {
    public static boolean map[] = new boolean[26];

    public static void removeDuplicate(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newstring);
        } else {
            newstring += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newstring);
        }
    }

    public static void main(String[] args) {
        String str = "aabcadbca";
        removeDuplicate(str, 0, "");
    }
}