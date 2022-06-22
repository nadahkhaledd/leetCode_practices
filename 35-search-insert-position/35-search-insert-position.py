class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if nums.__contains__(target):
            return nums.index(target)
        elif target > nums[-1]:
            return len(nums)
        else:
            for n in nums:
                if n > target:
                    return nums.index(n)