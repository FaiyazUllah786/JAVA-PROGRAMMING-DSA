import java.util.*;

class N_Queens {
    static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // vertical left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // vertical right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void NQueens(char[][] board, int row) {

        // base
        if (row == board.length) {
            for (char i[] : board) {
                for (char j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            count++;
            System.out.println();
            return;
        }
        // recursive
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                NQueens(board, row + 1);
                board[row][j] = '*';
            }

        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '*';
            }
        }
        NQueens(board, 0);
        System.out.println(count);
    }
}