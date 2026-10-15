class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                int count=0;
                HashMap<Integer,Integer> hm=new HashMap<>();
                for(int k=i;k<=j;k++){
                   hm.put(nums.get(k),hm.getOrDefault(nums.get(k),0)+1);
                }
                Set<Integer> keys=hm.keySet();
                for(Integer key:keys){
                    count++;
                }
                sum+=count*count;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna