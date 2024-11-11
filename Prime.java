package Java_Code;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check : ");
        int num = sc.nextInt();
        sc.close();
        if (num <= 1) {
            System.out.println("The entered number is not prime");
            return;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count == 0) {
                System.out.println(num + " is Prime number");
            } else {
                System.out.println(num + " is not prime number");
            }
        }
    }
}