class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> DisapperedList=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],0);
        }
          
        for(int i=1;i<=nums.length;i++){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                  hm.put(i,0);
            }
        }
     
       Set<Integer> keys=hm.keySet();
       for(Integer key:keys){
         if (hm.get(key) == 0) {
            DisapperedList.add(key);
           }
       }

      return DisapperedList;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna