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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ArrayList<Integer> l1 = new ArrayList<>();
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1!=null) {
            l1.add(curr1.val);
            curr1 = curr1.next;
        }
        while(curr2!=null) {
            l1.add(curr2.val);
            curr2 = curr2.next;
        }
        Collections.sort(l1);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int i=0; i<l1.size(); i++) {
            temp.next = new ListNode(l1.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }




}