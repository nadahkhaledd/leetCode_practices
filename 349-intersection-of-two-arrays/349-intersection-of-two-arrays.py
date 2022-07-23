class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        s = set()
        
        f = set(nums1)
        
        for n in nums2:
            if nums1.__contains__(n):
                s.add(n)
        
        return list(s)
        