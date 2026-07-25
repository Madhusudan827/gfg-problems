class Solution {
    public int[] getThreeLargest(int arr[]) {
       Arrays.sort(arr);
       int []n=new int[3];
       int first=arr[arr.length-1],second=Integer.MAX_VALUE,third=Integer.MAX_VALUE;
       for(int i=arr.length-2;i>=0;i--){
           if(second>=first ){
               second=arr[i];
           }
           if(third>=second ){
               third=arr[i];
           }
       }
           if(first>second && second>third && third<first){
              return new int[] {first,second,third};
        }else if(first >second && second>=third){
            return new int[] {first,second};
        }
         return new int[]{ first};
    }
        
    
}