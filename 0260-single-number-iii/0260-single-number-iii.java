class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
             map.put(num,map.getOrDefault(num,0)+1);
        }
        Iterator<Integer> i= map.keySet().iterator();
        int first=-1;
        int second=-1;
        while(i.hasNext()){
            int temp=i.next();
            if(map.get(temp)==1){
                if(first==-1){
                    first=temp;
                }else{
                    second=temp;
                }
            }
        }
        return new int[]{first,second};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna