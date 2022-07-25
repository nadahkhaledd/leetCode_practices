class Solution {
    
    boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i';
    }
    
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return s;

        StringBuilder answer = new StringBuilder(); ///remember stringBuilder is better for mutability

        int r = s.length() - 1;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                while (!isVowel(s.charAt(r)))
                    r--;
                answer.append(s.charAt(r));  /// this happens after while breaks so once the char found is a vowel
                r--;
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
    

}