package Java_Code;
import java.util.Scanner;
public class Maximum_Of_three_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= sc.nextInt();
        System.out.println("Enter b : ");
        int b= sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();
        int temp =(a>b)?(a>c?a:c):(c>b?c:b);
        System.out.println("Maximum of "+a+" , "+b+"  ,"+c+" is : "+temp);
        sc.close();
    }
}
