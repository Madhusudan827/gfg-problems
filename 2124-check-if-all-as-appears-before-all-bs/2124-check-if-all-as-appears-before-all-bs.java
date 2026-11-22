class Solution {
    public boolean checkString(String s) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(a>b){
                return false;
            }
            if(s.charAt(i)=='a'){
                a=i;
            }else{
                b=i;
            }
        }
        if(a>b){
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna