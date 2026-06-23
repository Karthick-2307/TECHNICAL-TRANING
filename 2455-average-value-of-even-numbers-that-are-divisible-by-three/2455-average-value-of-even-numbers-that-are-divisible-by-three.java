class Solution {
    public int averageValue(int[] nums) {
       int sum = 0;
       int count = 0; 

       for (int num : nums){
        if(num%6==0){
            sum +=num;
            count++;
        }
       }   
       return count == 0 ? 0: sum/count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna