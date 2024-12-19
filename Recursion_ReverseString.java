package Java_Code;

//time complexity : O(n)

public class Recursion_ReverseString {
    public static void Reverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Reverse(str, idx - 1);
    }

    public static void main(String[] args) {
        // Here either declare string separately or use "vaduni".length() fn. to get length
      
        Reverse("vaduni", "vaduni".length() - 1);
    }
}
