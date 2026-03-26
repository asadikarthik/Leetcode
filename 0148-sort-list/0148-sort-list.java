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
    public ListNode sortList(ListNode head) {
        
        ArrayList<Integer> al = new ArrayList<>();

        ListNode l = head;

        while(l!=null)
        {
            al.add(l.val);
            l=l.next;
        }
        Collections.sort(al);
        // System.out.println(al);

        if(al.size()==0)
        {
            return null;
        }
        else
        {
            ListNode s = new ListNode(al.get(0));
            ListNode t = s;
            for(int i=1;i<al.size();i++)
            {
                ListNode u = new ListNode(al.get(i));
                t.next = u;
                t=u;
            }
            return s;
        }
    }
}