package sorting;

public class quicksortalgo {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];// pivot as last element
        int i = low - 1;// i==-1;
        for (int j = low; j < high; j++) {// j iterate from low to before pivot
            if (arr[j] < pivot) {// displacing elements smaller than pivot
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // displacing pivot to such that smaller element<pivot<larger element
        // its a single displacement
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        // return pivot index to further break the array from pivot
        return i;
    }

    public static void QuickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            QuickSort(arr, low, pidx - 1);
            QuickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 7, 8, 2, 4, 6, 10, 1 };
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
