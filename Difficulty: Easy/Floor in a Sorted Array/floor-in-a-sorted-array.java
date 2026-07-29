class Solution {
    static int findFloor(int[] arr, int x) {
        int i=0;
        int j=arr.length-1;
        int index=-1;
        int value=Integer.MIN_VALUE;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<=x){
                value=Math.max(value,arr[mid]);
                index=mid;
                i=mid+1;
                
            }
            if(arr[mid]>x){
                j=mid-1;
            }
        }
        return index;
    }
}
