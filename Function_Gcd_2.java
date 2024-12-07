package Java_Code;

import java.util.Scanner;

public class Function_Gcd_2 {

    // modulo based Eucldeian algorithm - more efficient than subtraction based
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a : ");
        int a = sc.nextInt();
        System.out.println("enter value of b : ");
        int b = sc.nextInt();
        int gcd = greatestCommonDivisor(a, b);
        System.out.println("Greatest common divisor is : " + gcd);
        sc.close();
    }
}
