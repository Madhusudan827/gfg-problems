class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        return  1162261467 % n == 0;
      
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna