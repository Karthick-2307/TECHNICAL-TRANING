class Solution {
    public char repeatedCharacter(String s) {
        boolean[] seen= new boolean[26];
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index = ch-'a';
            if(seen[index]){
                return ch;
            }
            seen[index]=true;
        }
        return ' ';
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna