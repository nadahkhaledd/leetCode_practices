class Solution {
    public String convertToBase7(int num) {
        
        if (num == 0) 
            return "0";
        if (num < 0)  
            return "-" + convertToBase7(-num);

        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(num % 7);
            num /= 7;
        }
        return result.reverse().toString();

    }
}