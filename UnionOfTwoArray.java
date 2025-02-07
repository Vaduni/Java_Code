package Java_Code;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static int Union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int n=arr1.length;
        int n1=arr2.length;
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }    
        for(int j=0;j<n1;j++){
            set.add(arr2[j]);
        }
      System.out.println(set);
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,4};
        System.out.println("size of union is :"+Union(arr1, arr2));
    }
}
