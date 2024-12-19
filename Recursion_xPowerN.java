package Java_Code;

public class Recursion_xPowerN {
    public static int printPower(int x, int n) {
        // base cases
        if (n == 0) {
            return 1; // x^0=1
        }
        if (x == 0) {
            return 0; // 0^n=0
        }
        int power = printPower(x, n - 1);
        int xn = x * power;
        return xn;
    }

    public static void main(String[] args) {
        int output = printPower(2, 9);
        System.out.println(output);
    }
}
