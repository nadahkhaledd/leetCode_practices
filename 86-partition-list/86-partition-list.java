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
    public ListNode partition(ListNode head, int x) {
        
        if(head == null) return null;
        
        ListNode lh, gh, h;
        ListNode l = new ListNode();
        ListNode g = new ListNode();
        
        lh = l; gh = g; h = head;
        
        while(h != null)
        {
            if(h.val < x)
            {
                l.next = new ListNode(h.val);
                l = l.next;
            }
            else
            {
                g.next = new ListNode(h.val);
                g = g.next;
            }
            
            h = h.next;
        }
        
        l.next = gh.next;
        return lh.next;
        
        
        
    }
}