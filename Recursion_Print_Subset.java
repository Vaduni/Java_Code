package Java_Code;

import java.util.ArrayList;
//time complexity:O(2^n)

public class Recursion_Print_Subset {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size();) {
            System.out.println(subset.get(i) + "");
            return;
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.println(subset);
            return;
        }
        subset.add(n);
        findSubset(n - 1, subset);
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
