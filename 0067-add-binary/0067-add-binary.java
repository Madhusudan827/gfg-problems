class Solution {
    private String equal(int len,String s){
           String Zeros="";
              while(len>0){
                Zeros+=0;
                len--;
              }
              return Zeros+s;
    }
    public String addBinary(String a, String b) {
        if(a.length()>b.length()){
              
              int len=a.length()-b.length();
             b=equal(len,b);
        }
         if(a.length()<b.length()){
             int len=b.length()-a.length();
             a=equal(len,a);
        }

        System.out.println(a);
          System.out.println(b);
        char c='0';
        String temp="";
        for(int i=b.length()-1;i>=0;i--){
            char n=b.charAt(i);
            char m=a.charAt(i);
            if((n=='0' && m=='0') && c=='0' ){
                 temp+="0";
                 
            }else if((n=='0' && m=='0') && c=='1'){
                temp+="1";
                c='0';
            }else if((n=='1' && m=='1') && c=='0'){
                temp+="0";
                c='1';
            }else if((n=='1' && m=='1') && c=='1'){
                temp+="1";
                c='1';
            }else if(((n=='0' && m=='1') && c=='0') || ((n=='1' && m=='0') && c=='0')){
                temp+="1";
                c='0';
            }
            else if(((n=='0' && m=='1') && c=='1') || ((n=='1' && m=='0') && c=='1')){
                temp+="0";
                c='1';
            }
        }
        if(c=='1'){
            temp=temp+"1";
        }
        System.out.println(temp);
        String s="";
        for(int i=temp.length()-1;i>=0;i--){
            s+=temp.charAt(i);
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna