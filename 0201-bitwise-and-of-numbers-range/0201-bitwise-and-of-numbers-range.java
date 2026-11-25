class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int res=0;
       
        int count=0;
        if(left==right){
            return left;
        }
       
        while(left!=right){
           int r=right>>1;
           right=r;
           
           int l=left>>1;
           left=l;
            res=r&l;
           count++;
        }
        return res<<count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna