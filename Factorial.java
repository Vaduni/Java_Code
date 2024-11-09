package Java_Code;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("enter num : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            sc.close();
        }
        System.out.print("Factorial of number " + num + " is : " + fact);
    }
}
