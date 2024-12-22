package Java_Code;

public class Recursion_Insert_xAtLast {
    public static void InsertAtLast(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.print(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            InsertAtLast(str, idx + 1, count, newStr);
        } else {
            newStr += currentChar;
            InsertAtLast(str, idx + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abxcdxxb";
        InsertAtLast(str, 0, 0, "");
    }
}
