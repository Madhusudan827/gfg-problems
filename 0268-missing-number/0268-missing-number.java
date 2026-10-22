class Solution {
    public int missingNumber(int[] nums) {
       
        HashMap<Integer,Integer> hm=new HashMap<>();
       
        for(int i=0;i<=nums.length;i++){
            hm.put(i,0);
        }
        for(int i=0;i<nums.length;i++){
           if(hm.containsKey(nums[i])){
                    hm.put(nums[i],1);
           }
        }
        Set<Integer> keys=hm.keySet();
        for(Integer key:keys){
               if(hm.get(key)==0){
                return key;
               }
        }
       
       return -1;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna