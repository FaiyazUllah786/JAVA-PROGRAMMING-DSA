package String;

public class SubString {
    // creating own substring method
    public static String subString(String s, int si, int ei) {
        String ans = "";
        for (int i = si; i < ei; i++) {
            ans += s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        // predefined java method
        System.out.println(s.substring(0, 5));
        // our method
        System.out.println(subString(s, 0, 5));

    }
}
