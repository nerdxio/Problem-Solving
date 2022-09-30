package linkedlist;

public class MergeTwoSortedLists {

    public ListNode3 mergeTwoLists(ListNode3 list1, ListNode3 list2) {
        ListNode3 dummy = new ListNode3(0);
        ListNode3 head = dummy;
        while (list1!= null && list2 != null) {

            if (list1.val < list2.val) {
                dummy.next = list1; // add the  list 1 head to the output list
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;

        }
        if (list1 != null) {
            dummy.next = list1;
        } else {
            dummy.next = list2;
        }
        return head.next;
    }
}


class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}
