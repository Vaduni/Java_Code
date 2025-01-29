// This is a better approach as it is in-place and has a time complexity of O(n)

package Java_Code;

public class ReverseStringInPlace {
    public static void reverseString(char s[]) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
