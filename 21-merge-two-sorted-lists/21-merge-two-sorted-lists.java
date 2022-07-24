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
        
        ListNode answer = null;
        ListNode temp = null;
        
        while(list1!=null || list2 != null)
        {
            ListNode merged = null;
            if (list2 == null || (list1 != null && list1.val < list2.val))
            {
                merged = list1;                
                list1 = list1.next;
            }
            else{
                merged = list2;                
                list2 = list2.next;
            }
            
            if(answer != null)
                temp.next = merged;
            else
            {
                answer = merged;
            }
            
            temp = merged;
            temp.next = null;      
        }
        
        return answer;
        
    }
}