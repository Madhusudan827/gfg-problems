class Solution {
   
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Map<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       
        List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(hm.entrySet());
      
        list.sort(Map.Entry.comparingByValue());
     
        list.sort(Map.Entry.comparingByKey());
       list.sort((a, b) -> {
    if (a.getValue() != b.getValue())
        return b.getValue() - a.getValue();

    return a.getKey() - b.getKey();
    });

        
       ArrayList<Integer> al=new ArrayList<>();
      
       for(Map.Entry<Integer,Integer> entry: list){
          int temp1=entry.getValue();
          int temp2=entry.getKey();
          while(temp1>0){
              al.add(temp2);
              temp1--;
          }
       }
        
      
        return al;
    }
}