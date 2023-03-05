package Array;

import java.util.Scanner;
/*
        * array passes in function always as a pointer(pass by reference)
        * that is made to an array through also change original array
*/

public class ArrayCC {
    static Scanner sc = new Scanner(System.in);

    // updating an array
    public static void updateArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("You are updating array");
        updateArray(arr);// arr is passed as argument is by reference/pointer
        System.out.println("after updating array");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
