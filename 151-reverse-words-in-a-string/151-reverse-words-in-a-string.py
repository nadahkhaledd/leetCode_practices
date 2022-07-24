class Solution:
    def reverseWords(self, s: str) -> str:
        
        s = s.strip()
        s = s.split()[::-1]
            
        return ' '.join(s)
        