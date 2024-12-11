package Java_Code;

import java.util.Scanner;

public class Toggle_a_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        System.out.println("Enter position to toggle:");
        int pos = sc.nextInt();
        sc.close();
        int result = num ^ (1 << pos);
        System.out.println("Number before toggling : " + num);
        System.out.println("Number after Toggling: " + result);
    }
}
