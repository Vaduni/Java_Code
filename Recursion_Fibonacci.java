package Java_Code;

public class Recursion_Fibonacci {
    public static void printFibonacci(int n1,int n2,int n){
        if(n==0){
        return;
        }
        System.out.print(n1);
printFibonacci(n2, n1+n2, n-1); //n-1 becuase already printed one term a
    }
    public static void main(String[] args) {
        printFibonacci(0, 1, 7);
    }
}
