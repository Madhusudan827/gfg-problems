class Solution {
    public boolean findTriplets(int[] arr) {
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int sum=arr[i]+arr[j];
                for(int k=j+1;k<arr.length;k++){
                   if((sum+arr[k])==0){
                       return true;
                   }
                    
                }
               
            }
        }
        return false;
    }
}