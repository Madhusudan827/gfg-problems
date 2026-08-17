class Solution {
    public void mergeArrays(int a[], int b[]) {
      int arr[]=new int[a.length+b.length];
      int i=0; //for a
      int j=0; //for b
      int k=0; //for arr iteration
      
      while(i<a.length && j<b.length){
          if(a[i]<b[j]){
              arr[k]=a[i];
              i++;
          }else{
              arr[k]=b[j];
              j++;
          }
          k++;
      }
      while(i<a.length){
          arr[k++]=a[i++];
      }
       while(j<b.length){
          arr[k++]=b[j++];
      }
      
      for( i=0;i<a.length;i++){
          a[i]=arr[i];
      }
      j=a.length;
      for( i=0;i<b.length;i++){
          b[i]=arr[j];
          j++;
      }
    
        
       
    }
}
