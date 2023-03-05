package LinkedList;

// public class mergeSortLinkedList {
//     private static Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     private static Node merge(Node left, Node right) {
//         Node mergell = new Node(-1);// arbitary value
//         Node temp = mergell;
//         while (left != null && right != null) {
//             if (left.data <= right.data) {
//                 temp.next = left;
//                 left = left.next;
//                 temp = temp.next;
//             } else {
//                 temp.next = right;
//                 right = right.next;
//                 temp = temp.next;
//             }
//             // if left part remain
//             while (left != null) {
//                 temp.next = left;
//                 left = left.next;
//                 temp = temp.next;
//             }

//             // right part remain
//             while (right != null) {
//                 temp.next = right;
//                 right = right.next;
//                 temp = temp.next;
//             }
//         }
//         return mergell.next;// dont want to return ll from -1;
//     }

//     public static Node mergeSort(Node head) {
//         if (head == null || head.next == null)
//             return head;
//         // find mid
//         Node mid = getMid(head);
//         // left and right ms
//         Node rightHead = mid.next;
//         mid.next = null;
//         Node newLeft = mergeSort(head);// left part
//         Node newRight = mergeSort(rightHead);// right part
//         // merge
//         return merge(newLeft, newRight);
//     }

//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);

//         ll.first = ll.mergeSort(ll.first);

//     }
// }

//creating own LinkedList and see how they works
public class mergeSortLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirts
    public static void addFirts(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // assigning next to head
        newNode.next = head;
        // assigning head to newNode
        head = newNode;
    }

    // addLast
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // addinMiddle
    public static void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirts(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeFirst
    public static int removeFirst() {
        if (size == 0) {
            System.out.print("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // incase u want to see deleted val
        int val = head.data;
        // to remove from first just move head to forward
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public static int removeLast() {
        if (size == 0) {
            System.out.print("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;
    }

    // search(iterative)
    public static int searchKey(int key) {
        if (size == 0) {
            System.out.print("LinkedList is empty");
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key)
                return i;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // search(recursive)
    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int recurSearch(Node head, int key) {
        return helper(head, key);
    }

    // Reverse LinkedList
    public static void reverseL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Q.1***************FIND AND REMOVE NODE FROM END OF
    // LINKEDLIST********************************
    public static void deleteFromNth(int n) {
        // calculating size of ll
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        int findFromStart = sz - n;
        int i = 0;
        Node prev = head;
        while (i < findFromStart - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Q.2check palindrome
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        // incase of even ll fast==null and incase of odd ll fast.next==null
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;
    }

    public static boolean checkPalindrome() {
        // for single ll
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 --find mid
        Node midNode = findMid(head);
        // step 2 -- reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // step 2 -- check left part == right part
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // printLinkedList
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        mergeSortLinkedList ll = new mergeSortLinkedList();
        ll.addFirts(3);
        ll.addFirts(2);
        ll.addFirts(1);
        ll.addLast(5);
        ll.printList();
        ll.head = ll.mergeSort(ll.head);
        ll.printList();

    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node left, Node right) {
        Node mergell = new Node(-1);// arbitary value
        Node temp = mergell;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
            // if left part remain
            while (left != null) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }

            // right part remain
            while (right != null) {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        return mergell.next;// dont want to return ll from -1;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;
        // find mid
        Node mid = getMid(head);
        // left and right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);// left part
        Node newRight = mergeSort(rightHead);// right part
        // merge
        return merge(newLeft, newRight);
    }
}