class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
      ArrayList<Integer> al=new ArrayList<>();
     HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
     List<Map.Entry<Integer,Integer>> a=new ArrayList<>(hm.entrySet());
     a.sort(Map.Entry.comparingByKey());
       a.sort(Map.Entry.comparingByValue());
        
       
       Collections.reverse(a);
       int i=1;
       for(Map.Entry<Integer,Integer> entry:a){
           if(i<=k){
           al.add(entry.getKey());
           i++;
           }
           
       }
       
       return al;
       
       
        
         
    }
}







