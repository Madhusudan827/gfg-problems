class Solution {
    public int hammingWeight(int n) {
        String m=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<m.length();i++){
         if(m.charAt(i)=='1'){
            count++;
         }
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna