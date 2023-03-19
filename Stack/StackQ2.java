package Stack;

import java.util.Stack;

public class StackQ2 {
    // reverse a String using Stack
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String str2 = "hello world!";
        String result = reverseString(str);
        System.out.println(result);
        String result2 = reverseString(str2);
        System.out.println(result2);
    }
}
