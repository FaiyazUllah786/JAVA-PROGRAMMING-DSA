package sorting;
class binarysearch {
    // iterative method
    public static void BsearchItr(int arr[], int n, int key) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("key is present at index " + mid);
                break;
            } else {
                if (arr[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        if (low > high) {
            System.out.println("key not found");
        }

    }
    //recursive method
    public static int BsearchRec(int arr[], int low, int high, int key) {
        if (low == high) {
            if (arr[low] == key) {
                return low;
            }else{
                return -1;
            }
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } else {
            if (arr[mid] > key) {
                return BsearchRec(arr, low, mid - 1, key);
            } else {
                return BsearchRec(arr, mid + 1, high, key);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,10 };
        BsearchItr(arr, arr.length, 14);
        int ans = BsearchRec(arr, 0, arr.length-1, 1);
        if(ans==-1){
            System.out.println("key is not found");
        }else{
            System.out.println("key is present at index "+ans);
        }
    }
}