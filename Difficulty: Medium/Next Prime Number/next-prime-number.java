class Solution {
    public static int nextPrime(int n) {
           int m=n+1;
           while(true){
               boolean check=true;
               for(int i=2;i<=m/2;i++){
                    if(m%i==0){
                        check=false;
                        break;
                    }
               }
               if(check){
                   return m;
               }
               m++;
           }
      
    }
}