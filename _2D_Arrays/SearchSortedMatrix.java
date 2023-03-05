package _2D_Arrays;

public class SearchSortedMatrix {
    // brute force also solve it but tc = O(n2)
    // optimize approach(binary search)
    public static void stairCaseSearch(int mt[][], int key) {
        int row = 0;
        int col = mt[0].length - 1;
        while (row < mt.length && col >= 0) {
            if (mt[row][col] == key) {
                System.out.println("found at index (" + row + "," + col + ")");
                return;
            } else if (mt[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("not found");

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int key = 15;
        stairCaseSearch(matrix, key);
    }
}
