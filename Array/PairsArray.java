package Array;

public class PairsArray {
    public static void pairsArray(int num[]) {
        int totalPairs = 0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs : " + totalPairs);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        pairsArray(num);
    }
}
