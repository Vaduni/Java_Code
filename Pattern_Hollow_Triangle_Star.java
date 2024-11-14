package Java_Code;

import java.util.Scanner;

public class Pattern_Hollow_Triangle_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        sc.close();

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // inner loop for spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // inner loop for stars
            for (int j = 1; j <= 2 * i-1; j++) {

                // for printing stars at boundaries of triangle
                if (i == 1 || i == rows || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }

                // printing space between triangle
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
