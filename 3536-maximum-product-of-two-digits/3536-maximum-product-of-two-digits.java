class Solution {
    public int maxProduct(int n) {
      int max1=Integer.MIN_VALUE;
      int max2=Integer.MIN_VALUE;
        int product=1;
        while(n>0){
            int temp=n%10;
           if(max1<temp){
            max2=max1;
            max1=temp;
           }else if(max2<temp){
            max2=temp;
           }
           n=n/10;

        }
        
        product=max1*max2;
        return product;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna