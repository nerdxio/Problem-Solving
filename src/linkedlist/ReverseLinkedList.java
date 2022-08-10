package linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode pervious = null;
        ListNode temp = null;

        while(current != null){
            temp = current.next;
            current.next =pervious;
            pervious = current;
            current = temp;
        }
        return pervious;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}