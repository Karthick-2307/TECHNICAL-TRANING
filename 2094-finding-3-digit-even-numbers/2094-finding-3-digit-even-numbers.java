import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] f = new int[10];
        for (int d : digits) f[d]++;
        
        List<Integer> res = new ArrayList<>();
        for (int i = 100; i < 1000; i += 2) {
            int h = i / 100, t = (i / 10) % 10, o = i % 10;
            if (f[h] > 0 && f[t] > (h == t ? 1 : 0) && f[o] > ((h == o ? 1 : 0) + (t == o ? 1 : 0))) {
                res.add(i);
            }
        }
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna