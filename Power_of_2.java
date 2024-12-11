package Java_Code;

import java.util.Scanner;

public class Power_of_2 {
    public static void main(String[] args) {
        System.out.println("Enter positive number to check as power of 2 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if ((number > 0) && (number & (number - 1)) == 0) {
            System.out.println("Power of 2.");
        } else {
            System.out.println("Not power of 2.");
        }
    }
}
