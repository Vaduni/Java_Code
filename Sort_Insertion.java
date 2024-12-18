package Java_Code;

public class Sort_Insertion {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1; // j is for sorted part
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }

}
