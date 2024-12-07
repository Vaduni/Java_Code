package Java_Code;

import java.util.Scanner;

public class Function_Factorial {
    public static void Factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();
        Factorial(n);
    }
}
