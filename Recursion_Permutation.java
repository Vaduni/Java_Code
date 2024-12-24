package Java_Code;

public class Recursion_Permutation {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // for all the remaining characters
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPerm(newString, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }

}
