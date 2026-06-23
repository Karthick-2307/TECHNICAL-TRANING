class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs=0;
        int[] count = new int [101];
        for(int num :nums){
            goodPairs += count[num];
            count[num]++;
        }
        return goodPairs;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna