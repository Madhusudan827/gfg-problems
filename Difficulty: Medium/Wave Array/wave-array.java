class Solution {
    public void sortInWave(int arr[]) {
       for(int i=1;i<arr.length;i++){
           int temp=arr[i];
           if(i%2!=0){
               if(arr[i]>=arr[i-1]){
               arr[i]=arr[i-1];
               arr[i-1]=temp;
              } 
           }
       }
        
    }
}
