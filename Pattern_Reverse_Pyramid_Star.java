package Java_Code;

import java.util.Scanner;

public class Pattern_Reverse_Pyramid_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        sc.close();
        for(int i=rows;i>=1;i--){
            for(int j=i;j<=rows;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
