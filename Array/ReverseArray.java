package Array;

public class ReverseArray {
    public static void reverseArray(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            // swapping first and last element to reverse an array
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        reverseArray(num);
        for (int i : num)
            System.out.print(i + " ");

    }
}
