package Java_Code;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[row][cols];
        System.out.println("Enter matrix values: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter x to search: ");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == x) {
                    System.out.println(x + " is found on index " + i + "," + j);
                }
            }
        }
        sc.close();
    }
}
