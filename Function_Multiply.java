package Java_Code;
import java.util.Scanner;

public class Function_Multiply {
    public static int Multiply(int a, int b){
        int multiply =a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter value of b : ");
        int b=sc.nextInt();
        int multiply =Multiply(a, b);
        System.out.println("Multiplication is : "+multiply);
        sc.close();
    }
}
