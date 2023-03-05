package Array;

public class LinearSearch {
    public static int linerSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linerSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 55, 19, 77, 23, 11 };

        int key = 12;

        int idx = linerSearch(arr, key);
        if (idx == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is found at index : " + idx);
        }
        String food[] = { "samosa", "paniPoori", "pizza" };
        String key2 = "paniPoori";
        int idx2 = linerSearch(food, key2);
        if (idx2 == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is found at index : " + idx2);
        }
    }
}
