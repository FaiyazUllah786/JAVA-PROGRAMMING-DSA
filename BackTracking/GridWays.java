public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base
        if (i == n - 1 || j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        // recursive
        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }

    public static int factorial(int val) {
        if (val == 1) {
            return 1;
        }
        return val * factorial(val - 1);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;

        /*
         * since each cell have two possibilities either right or down
         * for n no of row and m no of columns
         * total no of cell become (n+m)
         * thus total no of possibilities become 2^(n+m)
         * hence T.C(2^(n+m)) which is very high
         */
        int ans = gridWays(0, 0, n, m);
        System.out.println(ans);

        /*
         * instead we can use formula
         * which is (n-1+m-1)!/((n-1)!*(m-1)!)
         * thus gives linear time complexity
         */
        int ans1 = factorial(n - 1);
        int ans2 = factorial(m - 1);
        int ans3 = factorial(n - 1 + m - 1);
        System.out.println(ans3 / (ans1 * ans2));
    }
}
