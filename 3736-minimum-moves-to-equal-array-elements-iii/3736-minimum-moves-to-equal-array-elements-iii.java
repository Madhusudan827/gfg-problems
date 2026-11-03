class Solution {
    public int minMoves(int[] nums) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        int move=0;
        
            for(int i=0;i<nums.length;i++){
                 
                 if(nums[i]<largest){
                    move+=largest-nums[i];
                 }
            }
            return move;

        }
         
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna