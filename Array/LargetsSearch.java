package Array;

public class LargetsSearch {
    static int largest = Integer.MIN_VALUE;
    static int smallest = Integer.MAX_VALUE;

    public static int largestSearch(int num[]) {
        for (int i : num) {
            if (i > largest) {
                largest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 21, 44, 54, 77, 1, 34 };
        System.out.println("largest value is : " + largestSearch(num));

    }
}
