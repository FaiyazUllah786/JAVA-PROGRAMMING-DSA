public class TrappingWater {
    public static int trapRainWater(int height[]) {
        int n = height.length;
        int totalTrapperWater = 0;
        // max height of left bar
        int maxLeftBar[] = new int[n];
        maxLeftBar[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeftBar[i] = Math.max(height[i], maxLeftBar[i - 1]);
        }
        // max height of right bar
        int maxRightBar[] = new int[n];
        maxRightBar[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRightBar[i] = Math.max(height[i], maxRightBar[i + 1]);
        }
        // loop
        for (int i = 0; i < n; i++) {
            // water level at each bar
            int waterLevel = Math.min(maxLeftBar[i], maxRightBar[i]);
            // trapped water at each bar
            int trappedWater = (waterLevel - height[i]);
            // total trrapped water
            totalTrapperWater += trappedWater;
        }
        return totalTrapperWater;
    }

    public static void main(String[] args) {
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trapRainWater(height));

    }
}
