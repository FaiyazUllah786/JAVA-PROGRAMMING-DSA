public class SudokuSolver {
    public static boolean isSafe(int[][] sodoku, int row, int col, int digit) {
        // row
        for (int i = 0; i <= 8; i++) {
            if (sodoku[i][col] == digit) {
                return false;
            }
        }
        // col
        for (int j = 0; j <= 8; j++) {
            if (sodoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        int stRow = (row / 3) * 3;
        int stCol = (col / 3) * 3;
        for (int i = stRow; i < stRow + 3; i++) {
            for (int j = stCol; j < stCol + 3; j++) {
                if (sodoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sodokuSolver(int[][] sodoku, int row, int col) {
        // base
        if (row == 9 && col == 0) {
            return true;
        }

        // recursive
        int nextRow = row, nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sodoku[row][col] != 0) {
            return sodokuSolver(sodoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sodoku, row, col, digit)) {
                sodoku[row][col] = digit;
                if (sodokuSolver(sodoku, nextRow, nextCol)) {
                    return true;
                }
                sodoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSodoku(int[][] sodoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sodoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sodoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
        };
        if (sodokuSolver(sodoku, 0, 0)) {
            System.out.println("Solution is Possible");
            printSodoku(sodoku);
        } else {
            System.out.println("Solution is not possible");
        }

    }
}
