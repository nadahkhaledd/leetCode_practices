class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
            
       int f[] = new int[26];
        int sec[] = new int[26];
        
        for(int i=0; i<t.length(); i++)
        {
            f[s.charAt(i)-97] +=1;
            sec[t.charAt(i)-97] +=1;
            
        }
        
        for(int i=0; i<26; i++)
            if(f[i] != sec[i])
                return false;
        
        return true;
    }
}