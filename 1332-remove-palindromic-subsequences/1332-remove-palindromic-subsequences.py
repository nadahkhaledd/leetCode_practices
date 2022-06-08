class Solution:
    def isPalindrome(s):
        return s == s[::-1]
    
    def removePalindromeSub(self, s: str) -> int:
        if len(s) ==0:
            return 0
        elif s == s[::-1]:
            return 1
        else:
            return 2