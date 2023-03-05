package BitManipulation;

public class UpdateIthBit {
    public static int clearIthBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static int setIthBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // first way to do that
        // if(newBit==0){
        // n=clearIthBit(n, i);
        // }else{
        // n=setIthBit(n, i);
        // }

        // second way
        // initially clearing the bit
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;

    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 0));
        System.out.println(updateIthBit(10, 0, 1));
    }
}
