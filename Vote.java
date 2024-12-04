package Java_Code;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.close();
        if(age>=18){
            System.out.println("VOTE, you are 18 Buddy!");
        }
        else{
            System.out.println("You are 18 buddy!");
        }

    }
}
