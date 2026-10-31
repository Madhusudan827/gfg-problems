class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int idx=0;
        for(int i=0;i<word.length();i++){
            char temp=word.charAt(i);
            if(temp==ch){
                idx=i;
                break;
            }
        }
        for(int i=idx;i>=0;i--){
            s+=word.charAt(i);

        }
        while((idx+1)<word.length()){
            s+=word.charAt(idx+1);
            idx++;
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna