package Java_Code;

import java.util.Scanner;

public class Pattern_Triangle_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        int number =1;
        sc.close();
for(int i=1;i<=rows;i++){
    for(int j=1;j<=i;j++){
        System.out.print(number+" ");
        number++;
    }
    System.out.println();
}
    }
}
