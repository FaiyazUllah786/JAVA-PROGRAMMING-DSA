package BitManipulation;

import java.util.*;

public class OddEven {
    public static void oddOrEven(int n) {
        // BitMask is value we used to get bit
        int BitMask = 1;
        if ((n & BitMask) == 1) {
            System.out.println("odd number");
        } else {
            System.out.println("Even number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddOrEven(n);
    }
}
