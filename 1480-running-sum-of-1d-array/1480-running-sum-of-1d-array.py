class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        s = []
        s.append(nums[0])
        
        for i in range(1, len(nums)):
            s.append(nums[i] + s[i-1])
            
        return s