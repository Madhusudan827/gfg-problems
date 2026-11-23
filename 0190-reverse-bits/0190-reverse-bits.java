class Solution {
    public int reverseBits(int n) {
 
        String binary="";
        while(n>0){
            int temp=n%2;
            n=n/2;
            binary+=String.valueOf(temp);
        }
        System.out.println(binary);
        if(binary.length()<32){
            int remain=32-binary.length();
             int i=1;
             String zero="";
             while(i<=remain){
               zero+="0";
               i++;
             }
          
                binary+=zero;
            
        }
        int num=0;
        int m=0;
        for(int i=binary.length()-1;i>=0;i--){
            int temp=(int)Math.pow(2,m);
            char c=binary.charAt(i);
            int bit=(c-'0');
            num+=temp*bit;
            m++;
        }
        return num;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna