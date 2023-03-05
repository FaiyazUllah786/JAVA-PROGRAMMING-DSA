class MaxSubArraySum {
    public static void maxSubArraSum(int num[]) {
        // finding max Sub array sum using prefix array (naming convention)
        int maxSubArray = Integer.MIN_VALUE;
        int totalSubArray = 0;
        int prefixSum[] = new int[num.length];
        prefixSum[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sumSubArray = (i == 0) ? prefixSum[end] : prefixSum[j] - prefixSum[i - 1];
                System.out.print(sumSubArray + " ");
                if (sumSubArray > maxSubArray) {
                    maxSubArray = sumSubArray;
                }
                totalSubArray++;
            }
            System.out.println();
        }
        System.out.println("total sub array : " + totalSubArray);
        System.out.println("max sub array : " + maxSubArray);

    }

    // kndanes algorithm for finding max sub array sum
    // it only give +ve max sub array sum

    public static void kanades(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currSum += num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("max sub array : " + maxSum);
    }

    // it will give -ve max sub array sum and also +ve
    public static void _kanades(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int check = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                check = num[i];
            }
        }
        if (check == -1) {
            for (int i = 0; i < num.length; i++) {
                currSum += num[i];
                maxSum = Math.max(maxSum, currSum);
            }
        } else {
            for (int i = 0; i < num.length; i++) {
                currSum += num[i];
                if (currSum < 0) {
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("max sub array : " + maxSum);
    }

    public static void main(String[] args) {
        int num2[] = { 1, -2, 6, -1, 3 };
        maxSubArraSum(num2);
        kanades(num2);
        _kanades(num2);
        // only for negative array elements
        int num[] = { -1, -2, -6, -1, -3 };
        _kanades(num);
    }
}