package Java_Code;

import java.util.Scanner;

public class Pattern_Sandglass_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        sc.close();

        for(int i=rows;i>=0;i--){
            for(int j=0;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }

        for(int i=1;i<=rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        
       
        }
        }
    }

