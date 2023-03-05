package BitManipulation;

public class clearIBits {
    public static int clearIBits(int n, int i) {
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
        System.out.println(clearIBits(10, 2));
    }
}
