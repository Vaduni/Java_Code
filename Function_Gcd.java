package Java_Code;

import java.util.Scanner;

public class Function_Gcd {
    public static int greatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
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
