package Java_Code;

public class Recursion_ToweOfHanoi {
    public static void Transfer(int n, String source, String helper,String dest){
        //base case
        if(n==1){
            System.out.println("transferring disk " +n+ " from "+source+" to "+dest);
            return;
        }
        Transfer(n-1, source, dest,helper);
        System.out.println("Transfer disk " +n+ " from "+source+" to "+dest);
        Transfer(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        Transfer(3, "S", "H", "D");
    }
}
