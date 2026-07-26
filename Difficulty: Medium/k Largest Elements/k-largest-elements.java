class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
      
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for( int i: arr){
            pq.add(i);
             if(pq.size()>k){
             pq.poll();
             
           
           
                }
        }
        
      
         ArrayList<Integer> al=new ArrayList<Integer>(pq);
         Collections.sort(al);
         Collections.reverse(al);       
        return al ;
    }
}
