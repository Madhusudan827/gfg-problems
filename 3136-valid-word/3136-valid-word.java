class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowelCount=0,consonentCount=0,numCount=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c>=48 && c<=57){
                numCount++;
            }else if((c>=65 && c<=90) || (c>=97 && c<=122) ){
                char temp=Character.toLowerCase(c);
                 if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                    vowelCount++;
                 }else{
                    consonentCount++;
                 }
            }else{
                return false;
            }

        }
        if(vowelCount>=1 && (consonentCount>=1 && vowelCount>=1)){
            return true;
        }
            return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna