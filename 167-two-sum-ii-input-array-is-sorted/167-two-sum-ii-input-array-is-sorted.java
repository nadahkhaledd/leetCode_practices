class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int r = numbers.length - 1;
        
        for(int l=0; l<numbers.length; l++)
        {
            int need = target - numbers[l];
            
            while(numbers[r] > need)
                r--;
            
            if(l < r && numbers[r] == need)
            {
                int[] answer = {l +1, r+1};
                return answer;
            }
                 
        }
        
        return null;
        
    }
}