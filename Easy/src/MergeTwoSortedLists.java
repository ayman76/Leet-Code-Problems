/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode preHead = new ListNode(-1);

        ListNode prev = preHead;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                prev.next = temp1;
                temp1 = temp1.next;
            } else {
                prev.next = temp2;
                temp2 = temp2.next;
            }

            prev = prev.next;
        }

        if (temp1 == null) {
            prev.next = temp2;
        } else {
            prev.next = temp1;
        }

        return preHead.next;

    }

}
