package Java_Code;

public class Backtracking_SudokuSolver {
    public boolean isSafe(char board[][], int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number + '0') {
                return false;
            }
            if (board[i][col] == number + '0') {
                return false;
            }
        }
        // grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == number + '0') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char board[][], int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }
        if (board[row][col] == '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            for (int i = 1; i < 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return true;
    }

    public void sudokusolver(char board[][]) {
        helper(board, 0, 0);
    }
    public static void main(String[] args) {

        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '7', '.', '.', '8', '.', '1', '2'},
            {'7', '.', '.', '2', '4', '1', '.', '.', '5'},
            {'.', '6', '.', '.', '1', '9', '5', '.', '.'},
            {'.', '.', '.', '8', '.', '3', '.', '9', '7'},
            {'1', '2', '3', '4', '5', '6', '7', '8', '9'}
        };

        Backtracking_SudokuSolver solver = new Backtracking_SudokuSolver();
        solver.sudokusolver(board);

        System.out.println("Solved Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

