class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:

        intervals = sorted(intervals)
        answer = [intervals[0]]
        
        i = 1        
        while i < len(intervals):
            if intervals[i][0] <= answer[-1][1]:
                answer[-1][1] = max(intervals[i][1], answer[-1][1])
            else:
                answer.append(intervals[i])   
            i+=1
                
        return answer
            
        