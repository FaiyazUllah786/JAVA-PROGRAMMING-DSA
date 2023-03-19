package Stack;

import java.util.Stack;

public class StackQ5 {
    // next greater element (it is an element of the first greater to the right)
    public static void nextGreater(int[] arr, int[] ans) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        ans[n - 1] = -1;
        s.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            int currValue = arr[i];
            while (!s.isEmpty() && currValue >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                int nextGreater = arr[s.peek()];
                ans[i] = nextGreater;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int ans[] = new int[arr.length];
        nextGreater(arr, ans);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
