class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        int ans=0;
       for(int i=0;i<=n;i++){
        ans= (int)Math.pow(2,i);
        if(ans==n){
           break;
        
         }else if(ans>n){
            return false;
          }
     }    
          if(ans>=Integer.MIN_VALUE && ans<Integer.MAX_VALUE){
            return true;
          }
           return false;
    }
  
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna