package Java_Code;

import java.util.Scanner;

public class Pattern_Hollow_Rectangle_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of columns");
        int cols = sc.nextInt();
        sc.close();

        // outer loop - for rows
        for (int i = 1; i <= rows; i++) {
            // inner loop - for columns
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
