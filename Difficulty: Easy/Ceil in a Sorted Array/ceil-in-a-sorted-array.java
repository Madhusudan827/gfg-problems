class Solution {
    public int findCeil(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        if(arr[0]>=x){
            return 0;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x ){
                ans=Math.min(mid,ans);
            }
            if(arr[mid]>=x){
                high=mid-1;
                
            }else if(arr[mid]<x){
                low=mid+1;
            }
        }
        if(ans<Integer.MAX_VALUE){
            return  ans;
        }
        return -1;
    }
}
