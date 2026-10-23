/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode findMiddle(ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode findReverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null) {
            ListNode nextNode = curr.next;
            curr.next = pre;

            pre = curr;
            curr = nextNode;
        }
        return pre;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) {
            return;
        }
        ListNode firstHalf = head;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = findReverse(middle.next);
        
        middle.next = null;

        while(secondHalf!=null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
            
        }
    }
}
