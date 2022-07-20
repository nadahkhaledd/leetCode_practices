class Solution {
    public int thirdMax(int[] nums) {
        
        Integer f = null, s = null, t = null;
        for (int num : nums) {
            if (f == null || num > f) 
            {
                t = s;
                s = f;
                f = num;
            } 
            else if (num == f) 
                continue;

            else if (s == null || num > s) 
            {
                t = s;
                s = num;
            } 
            else if (num == s) 
                continue;
            
            else if (t == null || num > t) 
                t = num;
                  
        }
        
        if (t != null) 
            return t;
        
        else 
            return f;
        
    }
}