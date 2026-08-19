class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        HashSet<Integer> hs=new HashSet<>();
      
           HashSet<Integer> second=new HashSet<>();
    
   for(int i: b){
       if(!second.contains(i)){
           second.add(i);
       }
   }
   for(int i:a){
       if(second.contains(i) ){
           hs.add(i);
       }
   }
  
    ArrayList<Integer> al=new ArrayList<>(hs);
    Collections.sort(al);
    return al;
     
    }
}