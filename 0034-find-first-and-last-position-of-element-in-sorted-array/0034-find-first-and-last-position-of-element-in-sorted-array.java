class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=findFirst(nums,target);
         arr[1]=findLast(nums,target);
        
         return arr;
    }

    private static int findFirst(int [] arr,int target){
        int index=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
           int mid=(i+j)/2;
           if(arr[mid]<target){
              i=mid+1;
           }else{
               j=mid-1;
           }
           if(arr[mid]==target){
              index=mid;
           }
        }
       
    
    
        return  index;

 }   
 public static int findLast(int [] arr,int target){
         int index=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
           int mid=(i+j)/2;
           if(arr[mid]>target){
              j=mid-1;
           }else{
               i=mid+1;
           }
           if(arr[mid]==target){
              index=mid;
           }
        }
          return  index;
       
   }
    
      
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna