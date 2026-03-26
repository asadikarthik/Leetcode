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
    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public ListNode merge(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode mid = middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next=null;
        left= merge(left);
        right=merge(right);
        

        return mergerTwoLists(left,right);
    }

    public ListNode mergerTwoLists(ListNode l1, ListNode l2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                temp.next = l1;
                l1 = l1.next;
            }
            else
            {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        
        return merge(head);
    }

}