class Solution {
    public int differenceOfSum(int[] nums) {
        int diff=0;
        for (int num : nums){
            diff +=num;
            while(num>0){
                diff -=num%10;
                num/=10;
            }
        }
        return Math.abs(diff);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna