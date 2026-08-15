class Solution {
    int majorityElement(int arr[]) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      if(arr.length==1){
          return arr[0];
      }
      int majority=1;
      int value=0;
      for(int i=0;i<arr.length;i++){
          hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
      }
     Set<Integer> keys=hm.keySet();
     for(Integer key:keys){
         if(hm.get(key)>majority){
             majority=hm.get(key);
             value=key;
         }
     }if(majority>arr.length/2){
           return value;
     }
     return -1;
        
    }
}