import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> answer = new ArrayList<>();
        
        int j=0;
        
        for(int i=0; i<nums1.length; i++)
        {
             while (j+1 < nums2.length && nums2[j] < nums1[i])
                j++;
            
            if(j < nums2.length && nums1[i] == nums2[j])
            {
                answer.add(nums1[i]);
                j++;
            }
            
                
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
        
        
    }
}