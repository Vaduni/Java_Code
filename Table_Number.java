package Java_Code;

import java.util.Scanner;

public class Table_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Table of " + number + "is :");
        for (int i = 1; i <= 10; i++) {

            System.out.println(number * i);
        }

    }
}
