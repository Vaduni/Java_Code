package Java_Code;

public class ReverseArrayOfString {
    public void reverseString(char s[]) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(s));
    }

    public static void main(String[] args) {
        String s = "hello";
        ReverseArrayOfString obj = new ReverseArrayOfString();
        obj.reverseString(s.toCharArray());
    }
}
