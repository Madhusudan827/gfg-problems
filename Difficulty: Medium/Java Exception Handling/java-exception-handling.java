class Solution {
    public int findMin(int a, int b)  {
       int add=a+b;
       int sub=a-b;
       int mul=a*b;
       int div=-1;
      if(b>0){
          div=a/b;
      }
        if(div>=0){
        return Math.min(add,Math.min(sub,Math.min(mul,div)));
        }
         return Math.min(add,Math.min(sub,mul));
    }
}