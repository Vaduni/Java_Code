package Java_Code;

import java.util.Scanner;

public class Function_Sum {
    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        sc.close();
        int sum = Sum(a, b);
        System.out.println("Sum is : " + sum);
    }
}
