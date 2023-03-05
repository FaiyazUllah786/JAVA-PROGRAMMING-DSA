package BitManipulation;

public class ClearRangeBits {
    public static int clearRangeBits(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeBits(15, 1, 2));
        System.out.println(clearRangeBits(15, 1, 3));
    }
}
