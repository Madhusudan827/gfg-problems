class Solution {
    static int nthFibonacci(int n) {
      if(n==1 || n==0){
          return n;
      }
      int fib=nthFibonacci(n-1)+nthFibonacci(n-2);
      return fib;
        
    }
}
