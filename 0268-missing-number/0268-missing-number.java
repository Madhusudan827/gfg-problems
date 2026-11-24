class Solution {
    public int missingNumber(int[] nums) {
     
       int  ans=0;
        for(int i=1;i<=nums.length;i++){
            ans^=i;
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=ans^nums[i];
            ans=res;
        }
        return res;
       
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna