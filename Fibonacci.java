package Java_Code;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to generate fibonacci series : ");
        int num = sc.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 + "," + n2);
        for (int i = 2; i <= num; i++) {
            int n3 = n1 + n2;
            System.out.print("," + n3);
            n1 = n2;
            n2 = n3;
            sc.close();
        }
    }
}
