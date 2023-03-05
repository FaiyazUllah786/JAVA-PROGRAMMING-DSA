package ArrayList;

import java.util.ArrayList;

public class WaterContainer {
    // Bruteforce T.C(On2)
    public static void storeWater(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size() - 1; i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int length = Math.min(height.get(i), height.get(j));
                int water = length * width;
                max = Math.max(max, water);
            }
        }
        System.out.println(max + " bruteforce");
    }

    // optimized approach T.C(On)
    public static void StoreWaterV2(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size() - 1;
        int max = Integer.MIN_VALUE;

        while (lp < rp) {
            int length = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int water = length * width;
            max = Math.max(max, water);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(max + " optimized");
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        storeWater(height);
        StoreWaterV2(height);
    }
}
