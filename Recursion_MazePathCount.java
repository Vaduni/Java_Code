package Java_Code;

//There is a maze of size(n*m) and we need to tavel to bottom right corner of maze(n-1,m-1) and find number of paths, so there will be two conditions we can move down or right only

public class Recursion_MazePathCount {
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // moving downward will increase row value by 1
        int downPath = countPath(i + 1, j, n, m);
        // moving rightward will increase column value by 1
        int rightPath = countPath(i, j + 1, n, m);
        return downPath + rightPath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPath = countPath(0, 0, n, m);
        System.out.println(totalPath);
    }
}
