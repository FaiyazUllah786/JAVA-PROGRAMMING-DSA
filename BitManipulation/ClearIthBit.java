package BitManipulation;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearIthBit(10, 3));
    }
}
