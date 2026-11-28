class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
             HashMap<Character,Integer> map=new HashMap<>();
               for(int k=0;k<s.length();k++){
                   map.put(s.charAt(k),map.getOrDefault(s.charAt(k),0)+1);
               }
            for(int j=i+1;j<words.length;j++){
                String t=words[j];
                boolean isExit=true;
                for(int k=0;k<t.length();k++){
                    if(map.containsKey(t.charAt(k))){
                        isExit=false;
                        break;
                    }
                }
               if(isExit){
                 int  temp=t.length()*s.length();
                   if(max<temp){
                    max=temp;
                   }
               }
               
               
              
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna