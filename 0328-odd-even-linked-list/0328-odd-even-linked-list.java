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
    public ListNode oddEvenList(ListNode head) {
        if(head==null ||head.next==null)
        {
            return head;
        }
        ListNode pre=head;
        ListNode prehead = head;
        ListNode curr = head.next;
        ListNode currhead = head.next;
        while(pre.next!=null && curr.next!=null)
        {
            pre.next = curr.next;
            pre = pre.next;

            curr.next = pre.next;
            curr = curr.next;
        }
        pre.next = currhead;
        return prehead;
    }
}