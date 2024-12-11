package Java_Code;

import java.util.Scanner;

public class Binary_1_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int count = 0;
        while (number > 0) {
            number = number & (number - 1);
            count++;
        }
        System.out.println("Number of 1's in the binary representation: " + count);
    }
}