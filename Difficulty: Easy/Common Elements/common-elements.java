class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
       ArrayList<Integer> al=new ArrayList<>();
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<a.length;i++){
           hm.put(a[i],hm.getOrDefault(a[i],0)+1);
       }
       
       for(int i=0;i<b.length;i++){
           int temp=b[i];
           if(hm.containsKey(b[i]) && hm.get(b[i])>0){
               hm.put(b[i],hm.get(b[i])-1);
               al.add(b[i]);
           }
       }
       Collections.sort(al);
        return al;
    }
}