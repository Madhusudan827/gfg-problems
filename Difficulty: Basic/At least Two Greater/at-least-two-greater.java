class Solution {
    public long[] findElements(long arr[]) {
       Arrays.sort(arr);
       long [] a=Arrays.copyOfRange(arr,0,arr.length-2);
       
       return a;
    }
}