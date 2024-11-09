package Java_Code;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to check even or odd : ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + "is Odd number");
        }
        sc.close();
    }
}
