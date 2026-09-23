class Solution {
    public static int nextPrime(int n) {

      while(true){
          n=n+1;
          boolean primeOrnot=true;
          for(int i=2;i<=Math.sqrt(n);i++){
              if(n%i==0){
                  primeOrnot=false;
                  break;
              }
          }
          if(primeOrnot){
              return n;
          }
      }
      
    }
}