package Array;

public class SubArray {
    public static void subArray(int num[]) {
        int maxSubArray = Integer.MIN_VALUE;
        int minSubArray = Integer.MAX_VALUE;
        int totalSubArray = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sumSubArray = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    sumSubArray += num[k];

                }
                System.out.println("\nsum of each sub array : " + sumSubArray);
                if (sumSubArray > maxSubArray) {
                    maxSubArray = sumSubArray;
                }
                if (sumSubArray < minSubArray) {
                    minSubArray = sumSubArray;
                }

                totalSubArray++;
            }
        }
        System.out.println("total sub array : " + totalSubArray);
        System.out.println("max sub array : " + maxSubArray);
        System.out.println("min sub array : " + minSubArray);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        subArray(num);

        int num2[] = { 1, -2, 6, -1, 3 };
        subArray(num2);
    }
}
