class Solution {
    static int findFloor(int[] arr, int x) {
       int m=Integer.MIN_VALUE;
       int idx=-1;
       for(int i=0;i<arr.length;i++){
           if(m<=arr[i] && arr[i]<=x){
               m=arr[i];
               idx=i;
           }
       }
       return idx;
    }
}
