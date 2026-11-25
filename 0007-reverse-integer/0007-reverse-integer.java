class Solution {
    public int reverse(int x) {
        if(!(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)){
                  return 0;
             }
       
        int  res=0;
        boolean negetive=false;
        if(x<0){
            negetive=true;
           
        }
        while(x!=0){
            int temp=x%10;
            x=x/10;
            if(res<Integer.MIN_VALUE/10){
                return 0;
            }
            if(res>Integer.MAX_VALUE/10){
                return 0;
            }
            res=res*10+temp;
            
           
        }

         

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna