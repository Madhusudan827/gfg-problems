class Solution {
    public boolean backspaceCompare(String s, String t) {
         ArrayList<Character> n=new ArrayList<>();
         ArrayList<Character> m=new ArrayList<>();

         for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='#' && !n.isEmpty()){
                n.remove(n.size()-1);
            }else{
                if(s.charAt(i)!='#'){
                          n.add(s.charAt(i));
                }
               
            }
         }
          for(int i=0;i<t.length();i++){
            if( t.charAt(i)=='#' && (!m.isEmpty())){
                m.remove(m.size()-1);
            }else{
              if(t.charAt(i)!='#'){
                   m.add(t.charAt(i));
                }
            }
         }
            String newS="";
         
         for(int i=0;i<n.size();i++){
            newS+=String.valueOf(n.get(i));
         }
           String newT="";
         for(int i=0;i<m.size();i++){
            newT+=String.valueOf(m.get(i));
         }
         System.out.println(n);
          System.out.println(m);
        if( n.equals(m)  ){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna