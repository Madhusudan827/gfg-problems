class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []arr =new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        

        for(int i=0;i<nums2.length;i++){
         

         while(! stack.isEmpty() && stack.peek()<nums2[i]){
            hm.put(stack.pop(),nums2[i]);
         }
         stack.push(nums2[i]);
          
            
            
        }
        int i=0;
        while(i<arr.length){
            arr[i]=hm.getOrDefault(nums1[i],-1);
            i++;
        }
        return arr;
    }
    
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna