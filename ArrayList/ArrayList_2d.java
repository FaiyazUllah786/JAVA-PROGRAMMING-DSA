package ArrayList;

import java.util.*;

public class ArrayList_2d {
    public static void main(String[] args) {
        List<List<Integer>> list_2d = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);

        list2.add(10);
        list2.add(12);

        list_2d.add(list);
        list_2d.add(list2);
        for (int i = 0; i < list_2d.size(); i++) {
            List<Integer> currList = list_2d.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
