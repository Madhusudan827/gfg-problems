class Solution {
    
    public static void sets(String s,String value,ArrayList<String> al){
         if(0==s.length()){
             al.add(value);
         }
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
             String newString=s.substring(0,i)+s.substring(i+1,s.length());
             sets(newString,value+c,al);
           
        }
    }
    public ArrayList<String> permutation(String s) {
         ArrayList<String> al=new ArrayList<>();
         sets(s,"",al);
         Collections.sort(al);
         return al;
        
    }
}