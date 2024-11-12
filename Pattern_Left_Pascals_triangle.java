package Java_Code;

import java.util.Scanner;

public class Pattern_Left_Pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        sc.close();
        // for upper half

        // outer loop - for rows
        for (int i = 1; i <= rows; i++) {
            // for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // inner loop for columns - printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower half
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
