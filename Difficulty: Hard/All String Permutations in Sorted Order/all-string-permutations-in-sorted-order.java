class Solution {
    
    
    public static void findPermutate(String s,String ans,ArrayList<String> al){
        if(s.length()==0){
          al.add(ans);
         
          return;
        }
        
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1,s.length());
            findPermutate(newString,ans+c,al);
        }
        
    }
    public ArrayList<String> permutation(String s) {
        ArrayList<String> al=new ArrayList<>();
       findPermutate(s,"",al);
       Collections.sort(al);
       return al;
        
    }
}