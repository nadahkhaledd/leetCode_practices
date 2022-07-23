class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = {}
        
        for w in strs:
            c = ''.join(sorted(w))
            words = []
            if result.__contains__(c):
                words = result[c]
            words.append(w)
            result[c] = words
                
        return result.values()
        