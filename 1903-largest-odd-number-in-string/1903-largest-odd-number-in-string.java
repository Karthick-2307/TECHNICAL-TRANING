class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length()-1;i>=0;i--){
            int digit = num.charAt(i)-'0';
            if (digit % 2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna