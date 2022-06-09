class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        first = 0
        sec = len(numbers)-1
        
        while first < sec:
            if numbers[first] + numbers[sec] == target:
                return [first+1, sec+1]
            elif numbers[first] + numbers[sec] < target:
                first += 1
            elif numbers[first] + numbers[sec] > target:
                sec -= 1