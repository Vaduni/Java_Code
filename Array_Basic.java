package Java_Code;

import java.util.Scanner;

public class Array_Basic {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                System.out.println("Match found at index : " + i);
            } 
        }

        sc.close();
    }
}
