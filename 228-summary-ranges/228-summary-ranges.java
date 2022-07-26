class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        int i=0, j=0;
        List<String> result = new ArrayList<>();
        
        while(i < nums.length)
        {
            j = i;
            while(j+1 < nums.length && nums[j] + 1 == nums[j+1])
                j++;
            
            if(i == j)
                result.add(Integer.toString(nums[i]));
            else
                result.add(Integer.toString(nums[i]) + "->" + Integer.toString(nums[j]));
            
            i = j+1;
        }
        
        return result;
        
    }
}