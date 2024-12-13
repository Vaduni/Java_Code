package Java_Code;

//time complexity - O(n^2)

public class Sort_Bubble {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // print array after each pass
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 6, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(arr);
        }
    }

}