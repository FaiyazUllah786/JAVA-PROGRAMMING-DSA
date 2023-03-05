package _2D_Arrays;

class DiagonalSum {
    // bruteforce
    public static int diagSum(int mt[][]) {
        int sum = 0;
        int n = mt.length;
        int m = mt[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += mt[i][j];
                }
                if (i + j == m - 1) {
                    sum += mt[i][j];
                }
            }
        }
        return sum;
    }

    // optimized
    public static int diagonalSum(int mt[][]) {
        int sum = 0;
        for (int i = 0; i < mt.length; i++) {
            sum += mt[i][i];
            int j = mt[0].length - 1 - i;
            if (i + j == mt[0].length - 1) {
                sum += mt[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(diagSum(matrix));

        System.out.println(diagonalSum(matrix));
    }
}