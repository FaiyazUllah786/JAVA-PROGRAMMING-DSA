package BitManipulation;

public class GetIthBit {
    public static void getIthBit(int n, int i) {
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        getIthBit(10, 2);
        getIthBit(10, 3);
    }
}
