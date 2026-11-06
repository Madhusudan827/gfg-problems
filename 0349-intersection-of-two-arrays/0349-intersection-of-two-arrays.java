class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
               if(isSeen( nums1[i], nums2) ){
                  hm.put(nums1[i],0);
               }
        }
        int [] arr=new int[hm.size()];
        Set<Integer> keys=hm.keySet();
        int k=0;
        for(Integer key:keys){
            arr[k]=key;
            k++;
        }
        return arr;
    }
    private static boolean isSeen(int ele,int[]  nums2){
        Arrays.sort(nums2);
             int i=0,j=nums2.length-1;
             while(i<=j){
                int mid=i+(j-i)/2;
                if(nums2[mid]==ele){
                    return true;
                }else if(nums2[mid]<ele){
                     i=mid+1;
                }else{
                    j=mid-1;
                }
             }
             return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna