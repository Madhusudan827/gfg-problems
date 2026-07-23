class Solution {
    public boolean isValid(String s) {
        String [] k=s.split("\\.",-1);
        if(k.length!=4){
            return false;
        }
       for(int i=0;i<k.length;i++){
           
           if(k[i].isEmpty()){
               return false;
           }
           if(k[i].length()>1 && k[i].charAt(0)=='0'){
               return false;
           }
           try{
           int j=Integer.parseInt(k[i]);
           if(j<0 || j>255 ){
               return false;
           }
           }catch(Exception e){
               return false;
           }
       }
        return true;
    }
}