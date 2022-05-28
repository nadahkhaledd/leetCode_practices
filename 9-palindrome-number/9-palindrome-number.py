class Solution:
    def isPalindrome(self, x: int) -> bool:
        xStr = str(x)
        return xStr == xStr[::-1]
    