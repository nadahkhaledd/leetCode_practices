/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode n = head;
        ListNode nn = head;
                
        while(nn != null && nn.next!=null)
        {
            nn = nn.next.next;
            n = n.next;
            if(n == nn)
                return true;
        }
        
        return false;
        
    }
}