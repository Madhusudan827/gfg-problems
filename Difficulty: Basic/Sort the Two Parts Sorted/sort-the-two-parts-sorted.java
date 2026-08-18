class Solution {
    public void sortHalves(int[] arr) {
    
        int i=0;
        int j=0;
        int mid=0;
        int temp[]=new int[arr.length];
        int m=0;
        boolean sorted=true;
        for(int k=0;k<arr.length-1;k++){
             if(arr[k]>arr[k+1]){
                 j=k+1;
                 mid=k;
                sorted=false;
                 break;
             }
        }
    if(!sorted){
     
             while(i<=mid && j<=arr.length-1 ){
                   if(arr[i]<arr[j]){
                      temp[m]=arr[i];
                      i++;
            }else{
                temp[m]=arr[j];
                j++;
            }
            m++;
      }
        while(i<=mid  ){
          temp[m++]=arr[i++];
      }
      while(j<arr.length  ){
          temp[m++]=arr[j];
          j++;
      }
            for(i=0;i<temp.length;i++){
                 arr[i]=temp[i];
            }
        }
    }
}