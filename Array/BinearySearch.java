package Array;

import java.util.Timer;

public class BinearySearch {
    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; // mid index
            if (num[mid] == key) { // found
                return mid;
            }
            if (num[mid] > key) { // left part
                end = mid - 1;
            } else { // right part
                start = mid + 1;
            }

        }
        return -1;// for invalid case and key not found
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 14;
        int idx2 = binarySearch(num, key);
        if (idx2 == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is found at index : " + idx2);
        }
    }
}
