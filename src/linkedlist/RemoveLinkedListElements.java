package linkedlist;

public class RemoveLinkedListElements {
    public ListNode3 removeElements(ListNode3 head, int val) {
        //if the head is our val
        while (head != null && head.val ==val){
            head = head.next;
        }
        ListNode3 currentNode = head;
        while(currentNode != null&& currentNode.next != null ){
            if(currentNode.next.val == val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
        return head.next;
    }
}
 class ListNode4{
     int val;
      ListNode next;
     ListNode4() {}
     ListNode4(int val) { this.val = val; }
     ListNode4(int val, ListNode next) { this.val = val; this.next = next; }
 }