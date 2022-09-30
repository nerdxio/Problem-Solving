package linkedlist;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode2 head) {
        if (head == null) return false;

        ListNode2 slow = head;
        ListNode2 fast = head.next;

        while (slow != fast) { // if slow  == fast it is mean there is a cycle

            if (fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }
}
//not complete solution
//public boolean hasCycle(ListNode2 head) {
//        HashSet<ListNode2>map = new HashSet<>();
//        if(head == null) return false;
//        while (head.next == null){
//           map.add(head);
//           if(!map.add(head.next)) return false;
//        }
//        return true;
//    }
