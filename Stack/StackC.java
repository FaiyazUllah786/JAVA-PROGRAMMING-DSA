package Stack;

import java.util.Stack;

public class StackC {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            int top = s.pop();
            System.out.println(top);
        }
    }
}
