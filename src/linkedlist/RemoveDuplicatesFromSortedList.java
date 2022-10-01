package linkedlist;

public class RemoveDuplicatesFromSortedList {

    public ListNode3 deleteDuplicates(ListNode3 head) {
       ListNode3 currentNode = head;
       while (currentNode != null && currentNode.next != null){
           if(currentNode.val == currentNode.next.val){
               currentNode.next = currentNode.next.next;
           }else{
               currentNode =currentNode.next;
           }
       }
       return head;
    }

}
