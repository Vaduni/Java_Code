package Java_Code;

import java.util.Scanner;

public class Pattern_Diamond_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        sc.close();

        // upper half
        // outer loop for printing rows
        for (int i = 1; i <= rows; i++) {
            // inner loop for printing spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // inner loop for printing descending numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // printing ascending numbers
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        // lower half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
