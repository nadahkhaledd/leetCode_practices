class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;
        
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[k] = nums[i];   /// we shift all the numbers that are not value to the beginning and return number of shifted values (simulating deletion)
                k++;
            }
        }
        
        return k;
        
    }
}