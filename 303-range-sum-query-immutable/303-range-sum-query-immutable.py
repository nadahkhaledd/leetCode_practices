class NumArray:
    prefixSum = []

    def __init__(self, nums: List[int]):       
        self.prefixSum = [0] * len(nums)
        for i in range(len(nums)):
            self.prefixSum[i] = nums[i]
            if i > 0:
                self.prefixSum[i] += self.prefixSum[i-1]
        

    def sumRange(self, left: int, right: int) -> int:
        s = self.prefixSum[right]
        if left>0:
            s-= self.prefixSum[left-1]
        return s
        
        
        


