package Stack;

import java.util.Stack;

public class StackQ3 {
    // reverse a Stack using constant space
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // before s=3,2,1 after s=1,2,3
        reverseStack(s);
        while (!s.isEmpty()) {
            int top = s.pop();
            System.out.println(top);
        }
    }
}
