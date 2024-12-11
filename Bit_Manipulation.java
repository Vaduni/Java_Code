package Java_Code;

import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;

        // get bit
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

        // set bit
        int newNumber = (bitMask | n);
        System.out.println(newNumber);

        // clear bit
        int newNumber2 = ~(bitMask);
        int newNumber3 = (newNumber2 & n);
        System.out.println(newNumber3);

        // update bit
        System.out.println("enter value to be updated to either 0 or 1");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        if (operation == 1) {
            // same as set bit
            int newNumber4 = bitMask | n;
            System.out.println(newNumber4);
        } else {
            // same as clear bit
            int newNumber5 = (newNumber2 & n);
            System.out.println(newNumber5);
        }
        sc.close();
    }
}
