class Solution {
    public int[] nextGreaterElements(int[] nums) {
  
        Map<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            hm.put(i,-1);
        }
        
        for(int i=0;i<2*nums.length;i++){
          int  index=i%(nums.length);
            while(!stack.isEmpty() && nums[stack.peek()]<nums[index] ){
              
              
                    hm.put(stack.peek(),nums[index]);
                      stack.pop();
                
            }
               stack.push(index);
              
            }
            
            
            int arr[]=new int[nums.length];
            int i=0;
            for(int num:nums){
                arr[i]=hm.get(i);
                 i++;
            }
           return arr;
        }
      
       
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna