class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]==0){
                i++;
            }else if(nums[i]!=0 && nums[j]==0){
                //swap
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
   // again
   i=0;
   j=1;
        while(j<nums.length){
            if(nums[i]==0 || nums[i]==1){
                i++;
            }else if((nums[i]!=0 && nums[i]!=1) && nums[j]==1){
                //swap
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna