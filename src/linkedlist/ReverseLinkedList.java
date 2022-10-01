package linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode3 reverseList(ListNode3 head){
        ListNode3 current = head;
        ListNode3 pervious = null;
        ListNode3 next = null;

        while(current != null){
            next = current.next;
            current.next =pervious;
            pervious = current;
            current = next;
        }
        return pervious;
    }
}
class ListNode {
    int val;
    ListNode3 next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode3 next) { this.val = val; this.next = next; }
}