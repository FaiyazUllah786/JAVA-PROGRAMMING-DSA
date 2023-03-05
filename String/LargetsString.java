package String;

public class LargetsString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            // compareTo method compare two string lexographically
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
