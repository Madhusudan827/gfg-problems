class Solution {
    private static int CountOnes(int n){
           int count_ones=0;
           while(n>0){
              int temp=n%2;
              n=n/2;
              if(temp==1){
                count_ones++;
              }
           }
           return count_ones;
    }
    public int[] countBits(int n) {
        int [] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            if(i==0){
                ans[i]=0;
            }else if(i==1 || i==2){
                ans[i]=1;
            }else{
                    ans[i]= CountOnes(i);
            }
        } 
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna