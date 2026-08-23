class Solution {
   static int count=0;
    public static void numberofPairs(int arr[],int s,int e){
        if(s>=e){
            return ;
        }
        int mid=(s+e)/2;
        numberofPairs(arr,s,mid);//left
        numberofPairs(arr,mid+1,e); //right
       merge(arr,s,mid,e);
        
    }
    public static void merge(int arr[],int s,int mid ,int e){
        int temp []=new int [e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                 count=count+(mid-i+1);
                 temp[k]=arr[j];
                 j++;
            }
            k++;
            
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        for( k=0,i=s;k<temp.length;k++,s++){
            arr[s]=temp[k];
        }
        
    }
     
 
    public int inversionCount(int arr[]) {
        count=0;
         numberofPairs(arr,0,arr.length-1);
         return count;
       
       
        
    }
}