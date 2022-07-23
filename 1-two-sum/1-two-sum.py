class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}
        for i in range(len(nums)):
            need = target - nums[i]
            if m.__contains__(need):
                return [i, m.get(need)]
            
            m[nums[i]] = i