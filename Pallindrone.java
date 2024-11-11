package Java_Code;

import java.util.Scanner;

public class Pallindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.close();
        int rem, temp, reverse = 0;
        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp /= 10;
        }
        if (num == reverse) {
            System.out.println("Pallindrone number");
        } else {
            System.out.println("Not Pallindrone Number");
        }
    }
}
