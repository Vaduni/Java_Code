package Java_Code;

public class Recursion_Tiling_Problem {
    public static int placeTiles(int n, int m) {
        if (n < m) {
            return 1;
        }
        if (n == m) {
            return 2;
        }
        // placing tile vertically
        int verticalPlace = placeTiles(n - m, m);
        // placing horizontally
        int horizontalPlace = placeTiles(n - 1, m);
        return verticalPlace + horizontalPlace;
    }

    public static void main(String[] args) {
        int n = 4, m = 6;
        System.out.println(placeTiles(n, m));
    }
}
