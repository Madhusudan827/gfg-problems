class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastSeen=n&1;
        n=n>>1;
        while(n>0){
            int currentBit=n&1;
            if(currentBit==lastSeen){
                return false;
            }
            lastSeen=currentBit;
            n=n>>1;
        }
       return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna