import java.util.*;

public class Solution {
    public static List<String> arr = new ArrayList<>();
    public static boolean value = false;

    public static void permutation(String s1, String ans) {
        // basie
        if (s1.length() == 0) {
            arr.add(ans);
            System.out.println(arr);
            return;
        }
        // recursive
        for (int i = 0; i < s1.length(); i++) {
            char curr = s1.charAt(i);
            // String subStr = s1.subString(0, i) + s1.subString(i + 1);
            String subStr = s1.substring(0, i) + s1.substring(i + 1);
            permutation(subStr, ans + curr);
        }
    }

    public static void sbString(String s2, String ans, int i) {
        // base
        if (i == s2.length()) {
            if (value == false) {
                for (int j = 0; j < arr.size(); j++) {

                    if (ans.equals(arr.get(j))) {
                        value = true;
                        break;
                    }
                }
            }
            return;
        }
        // recursive
        sbString(s2, ans + s2.charAt(i), i + 1);
        sbString(s2, ans, i + 1);
    }

    public static boolean checkInclusion(String s1, String s2) {

        String ans1 = "";
        String ans2 = "";
        permutation(s1, ans1);
        sbString(s2, ans2, 0);
        return value;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}