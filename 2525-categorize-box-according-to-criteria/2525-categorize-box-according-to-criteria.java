class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length*width*height;
        boolean isbulky= length>=10000||width>=10000||height>=10000|| volume>=1000000000;
        boolean isheavy=mass>=100;
        if(isbulky && isheavy){
            return "Both";
        }
        else if(!isbulky && !isheavy){
            return "Neither";
        }
        else if (isbulky){
            return "Bulky";
        }
        else{
            return"Heavy";
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna