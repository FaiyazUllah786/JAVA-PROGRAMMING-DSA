package LinkedList;

//importing LinkedList
import java.util.LinkedList;

public class Classroom {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.add(1);// simply add last
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        // remove
        ll.removeFirst();
        ll.removeFirst();
        System.out.println(ll);
    }
}
