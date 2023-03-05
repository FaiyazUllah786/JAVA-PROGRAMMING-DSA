package BackTracking;

public class subset {
    public static void subSet(String s, StringBuilder ans, int i) {
        // base
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(i + " " + ans);
            }
            return;
        }

        // yes
        subSet(s, ans.append(s.charAt(i)), i + 1);

        ans.deleteCharAt(ans.length() - 1);
        // System.out.println(i + " " + ans);
        // no
        subSet(s, ans, i + 1);

    }

    public static void main(String[] args) {
        String val = "eidbaoo";
        StringBuilder ans = new StringBuilder();
        subSet(val, ans, 0);

    }
}
