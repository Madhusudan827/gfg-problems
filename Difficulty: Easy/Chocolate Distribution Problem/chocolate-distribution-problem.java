class Solution {
    public int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
      int diff=Integer.MAX_VALUE;
      
     for(int i=0;i<=arr.length-m;i++){
         if(m+i-1<arr.length){
           diff=Math.min(diff,arr[m+i-1]-arr[i]);
         }
     }
       return diff;
    }
}