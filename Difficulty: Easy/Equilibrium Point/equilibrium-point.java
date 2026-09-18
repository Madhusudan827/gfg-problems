class Solution {
    public static int findEquilibrium(int arr[]) {
      
      for(int i=1;i<arr.length;i++){
          arr[i]+=arr[i-1];
         
          
      }
      for(int i=1;i<arr.length;i++){
          int left=arr[i-1];
          int right=arr[arr.length-1]-arr[i];
          if(left==right){
              return i;
          }
      }
      return -1;
        
    }
}
