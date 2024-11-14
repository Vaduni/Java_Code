package Java_Code;

import java.util.Scanner;

public class Pattern_Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i - 1; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number+" ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
