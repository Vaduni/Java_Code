package Java_Code;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("enter value of b : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is = " + sum);
        sc.close();
    }

}
