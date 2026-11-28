class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
           
            if(max<temp){
                max=temp;
            }
            if(temp<0){
           
                temp=0;
            }
          
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna