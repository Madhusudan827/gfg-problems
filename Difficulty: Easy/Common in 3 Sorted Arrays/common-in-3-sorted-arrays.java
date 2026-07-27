class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> al=new ArrayList<>();
        TreeSet<Integer> ts=new TreeSet<>();
          int i=0;
          int j=0;
          int k=0;
          while(i< a.length && j<b.length&& k<c.length){
               if(a[i]==b[j] && b[j]==c[k]){
                 
                   ts.add(a[i]);
                   
                   i++;
                   j++;
                   k++;
               }
               else if(a[i]<b[j]){
                   i++;
               }else if( b[j]>c[k]){
                   k++;
               }else{
                   j++;
               }
          }
          Iterator <Integer> elements=ts.iterator();
          while(elements.hasNext()){
              al.add(elements.next());
          }
          return al;
          
        
    }
}