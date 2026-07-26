class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
       Arrays.sort(arr);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int q=1;
        for(int i=arr.length-1;i>=0;i--){
            if(q<=k){
                al.add(arr[i]);
                q++;
            }
        }
        return al;
    }
}
