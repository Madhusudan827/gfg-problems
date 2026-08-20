class Solution {
    public static void mergeSort(int[] arr ,int low ,int high){
        if(low==high){
            return ;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low ,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(i=low,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public void sortLastM(int[] arr, int m) {
         mergeSort(arr,0,arr.length-1);
        
        
    }
}