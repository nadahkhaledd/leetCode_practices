# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        ha = headA
        hb = headB
        
        while headA != headB:
            headA = headA.next if headA is not None else hb
            headB = headB.next if headB is not None else ha
        
        return headA
        