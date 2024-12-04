package Java_Code;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button number (1-3) : ");
        int button= sc.nextInt();
        sc.close();
        if(button==1){
System.out.println("Hello");
        }
        if(button==2){
            System.out.println("Namaste");
        }
        if(button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid button please Re-enter .");
        }
    }
}
