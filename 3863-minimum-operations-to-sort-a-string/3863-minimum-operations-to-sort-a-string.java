class Solution {
    public int minOperations(String s) {
        char []arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
        // if check it is sorted or not
        boolean isSort=true;
          for(int i=1;i<s.length();i++){
                 if(s.charAt(i-1)>s.charAt(i)){
                    isSort=false;
                }
           }
        if(isSort){
        return 0;
       }
       if(s.length()==2){
        return -1;
       }
    // substring sort
   int mn=s.charAt(0) ,mx=s.charAt(0);
   for(int i=1;i<s.length();i++){
      int c=s.charAt(i);
      if(c<mn){
        mn=c;
      }
      if(c>mx){
        mx=c;
      }
   }
   if(s.charAt(0)==mn|| s.charAt(s.length()-1)==mx){
    return 1;
   }
   for(int i=1;i<s.length()-1;i++){
     char c=s.charAt(i);
     if(c==mn || c==mx) return 2;
   }
   return 3;
   

       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna