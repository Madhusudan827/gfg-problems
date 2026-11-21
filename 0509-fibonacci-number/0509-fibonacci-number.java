class Solution {
    public int fib(int n) {
        if( n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        int sum= fib(n-1)+fib(n-2);
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna