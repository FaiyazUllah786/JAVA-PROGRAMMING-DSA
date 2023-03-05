package BackTracking;

public class permutation {

    public static void permutStr(String s, String ans) {
        // base
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursive
        for (int i = 0; i < s.length(); i++) {
            char curr = (s.charAt(i));
            String subStr = s.substring(0, i) + s.substring(i + 1);
            permutStr(subStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String val = "abc";
        String ans = "";
        permutStr(val, ans);
    }
}
