class Solution {
    public int power(int x ,int n){
        
        if(n==1){
            return x;
        }
        // int pow= power(x,n-1)*power(x,n-1);
        // // int pow=temp*;
        // if(n%2!=0){
        //     pow=x*pow;
        // }
        int pow=x*power(x,n-1);
        return pow;
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
       
        int result =power(2,n);
        return result-1;
    }
}
