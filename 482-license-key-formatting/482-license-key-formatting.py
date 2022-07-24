class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        
        s = ''.join(s.split('-'))
        s = s.upper()
        answer = []
        
        for i in range(len(s)-1,-1, -k):
            sub = i-(k-1) if i-(k-1) >=0 else 0  
            answer.append(s[sub:i+1])
            
        return '-'.join(answer[::-1])
        
            
            
        