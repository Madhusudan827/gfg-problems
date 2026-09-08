class Solution {
    static boolean armstrongNumber(int n) {
         int m=n;
        String s=String.valueOf(n);
        int num=0;
        for(int i=0;i<s.length();i++){
           int temp=n%10;
           n=n/10;
           num+= (int)Math.pow(temp,s.length());
         
        }
        if(num==m){
            return true;
        }
        return false;
    }
}