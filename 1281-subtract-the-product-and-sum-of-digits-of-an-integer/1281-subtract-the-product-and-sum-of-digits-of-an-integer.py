class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        summ = 0
        prod = 1
        
        while n > 0:
            last = n % 10
            summ +=last
            prod *=last
            n = n // 10
            
        return prod - summ
        
        