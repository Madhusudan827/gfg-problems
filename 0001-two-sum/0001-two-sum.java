class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int [] a=new int[2];
        int b=0,c=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(hm.containsKey(need) && i!=hm.get(need)){
               b=hm.get(need);
               c=i;
               break;
            }
        }
        a[0]=b;
        a[1]=c;
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna