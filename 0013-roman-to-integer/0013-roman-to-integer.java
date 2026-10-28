class Solution {


    public int romanToInt(String s) {
        int num=0;
        for(int i=s.length()-1;i>=0;){
          
            

            if(i!=0){
               int value=RomanValue(s.charAt(i));
               int temp=RomanValue(s.charAt(i-1));
               if(temp<value){
                  num+=value-temp;
                 i=i-2;
               }else{
                num+=value;
                i=i-1;
               }

            }else{
                num+=RomanValue(s.charAt(i));
                i=i-1;
            }
            
        }
       return num;
    }
    private static int RomanValue(char c){
         
          if('I'==c){
                return 1;
            }else if('V'==c){
                return 5;
            }else if('X'==c){
               return 10;
            }else if('L'==c){
                return 50;
            }else if('C'==c){
                 return 100;
            }else if('D'==c){
                return 500;
            }else if('M'==c){
                 return 1000;
            }

            return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna