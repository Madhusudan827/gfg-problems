class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> index=new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
          if(nums[i]==target){
            index.add(i);
          }
       }
       Collections.sort(index);
       return index;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna