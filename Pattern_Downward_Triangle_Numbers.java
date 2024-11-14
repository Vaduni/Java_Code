package Java_Code;

import java.util.Scanner;

public class Pattern_Downward_Triangle_Numbers {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        sc.close();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }
}
