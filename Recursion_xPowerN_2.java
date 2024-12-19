package Java_Code;

//calculating x^n of height (log n)

public class Recursion_xPowerN_2 {
    public static int printPower(int x, int n) {
        // base cases
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        }
        // if n is odd
        else {
            return printPower(x, n / 2) * printPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int output = printPower(2, 8);
        System.out.println(output);
    }
}
