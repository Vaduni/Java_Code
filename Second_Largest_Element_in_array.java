package Java_Code;

public class Second_Largest_Element_in_array {
    public static int  secondLargest(int arr[],int n){
        if(n<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];  
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
            
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,3,7,8,13};
        int n=arr.length;
        secondLargest(arr, n);
        System.out.println("Second Largest element is : "+secondLargest(arr, n));
    }
}
