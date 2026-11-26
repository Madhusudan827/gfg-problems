class Solution {
    public int singleNumber(int[] nums) {
        int ele=0;
        int i=0;
        while(i<nums.length){
            ele^=nums[i];
            i++;
        }
        return ele;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna