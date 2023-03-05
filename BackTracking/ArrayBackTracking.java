import java.util.*;

public class ArrayBackTracking {
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bt(int[] arr, int idx, int val) {
        if (idx == arr.length) {
            printArr(arr);
            return;
        }
        // assign val//track
        arr[idx] = val;
        bt(arr, idx + 1, val + 1);
        // decrease -2//backTrack
        arr[idx] = val - 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        bt(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}
