class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        boolean positive=false;
        boolean negetive=false;
        long num=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        
               
            if(i==0 && c=='-'){
                negetive=true;
            }
            else if(i==0 && c=='+'){
                positive=true;
            }
            else{
                if(c>=48 && c<=57){
                    num=num*10+  Character.getNumericValue(c);
                    if( negetive && num>2147483648L){
                          return Integer.MIN_VALUE;
                    }
                    if( !negetive && num>Integer.MAX_VALUE ){
                            return Integer.MAX_VALUE;
                    }

                }else{
                        break;
            }
            }

        }
        if(negetive){
            
            
            return (int) (0-num);
           
        }
         
            return  (int)num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna