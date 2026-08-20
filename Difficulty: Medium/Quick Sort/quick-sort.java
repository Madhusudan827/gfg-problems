class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return ;
        }
            int parIdx=partition(arr,low,high);
            quickSort(arr,low,parIdx-1); // left
            quickSort(arr,parIdx+1,high); //right
        
    }

    private int partition(int[] arr, int low, int high) {
         int pivot=arr[high];
         int i=low-1;
         for(int j=low;j<high;j++){
             if(arr[j]<pivot){
                 i++;
                 int temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
             }
         }
         i++;
         int temp=arr[i];
         arr[i]=pivot;
         arr[high]=temp;
        return i;
    }
}