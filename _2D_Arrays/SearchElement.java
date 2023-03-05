package _2D_Arrays;

public class SearchElement {
    public static void search(int mat[][], int key) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == key) {
                    System.out.println("found at index (" + i + "," + j + ")");
                    return;

                }
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        search(matrix, 8);

    }
}
