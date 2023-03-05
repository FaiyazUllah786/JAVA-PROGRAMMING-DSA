
class Solution {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] left = new int[n];
        int[] right = new int[n];
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = s.indexOf(c, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = s.indexOf(c, i);
        }
        for (int i = 0; i < n; i++) {
            if (right[i] < 0) {
                ans[i] = left[i];
            } else if (right[i] < 0) {
                ans[i] = left[i];
            } else {
                ans[i] = Math.min(left[i], right[i]);
            }
        }
        // for (int i = 0; i < n; i++) {
        // ans[i] -= i;
        // }
        return ans;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] ans = shortestToChar(s, c);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.indexOf(c, i) + " ");
        }
        System.out.println();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.indexOf(c, i) + " ");
        }
        // System.out.print(s.indexOf(c, 1) + " ");
    }
}