class Solution {
    public int getSum(int a, int b) {
        int c;
        while(b!=0){
            c=(a&b);
            a=(a^b);
            b=(c)<<1;

        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna