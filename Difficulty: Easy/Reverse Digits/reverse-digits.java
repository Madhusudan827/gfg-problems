class Solution {
    public int reverseDigits(int n) {
        int k=0;
        while(n>0){
            
            int temp=n%10;
            k=k*10+temp;
            n=n/10;
            
        }
        return k;
        
    }
}