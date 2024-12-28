package Java_Code;

public class Sort_Merge {
    public static void conquer(int arr[], int low, int mid, int high) {
        int merged[] = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= high) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0; i < merged.length; i++) {
            arr[low + i] = merged[i];
        }
    }

    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        conquer(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int arr[] = { 12, 4, 11, 5, 17 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
