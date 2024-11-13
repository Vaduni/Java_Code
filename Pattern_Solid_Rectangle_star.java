package Java_Code;

import java.util.Scanner;

public class Pattern_Solid_Rectangle_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of columns");
        int cols = sc.nextInt();
        sc.close();
for(int i=1;i<=rows;i++){
    for(int j=1;j<=cols;j++){
        System.out.print("*");
    }
    System.out.println(" ");
}
    }
}
