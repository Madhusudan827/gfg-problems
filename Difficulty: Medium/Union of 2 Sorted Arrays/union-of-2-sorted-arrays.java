class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       
        ArrayList<Integer> al=new ArrayList<>();
        int i=0;
        int j=0;
        int k=0; // for arraylist
        while(i<a.length && j<b.length){
              if(k==0){
                  al.add(Integer.MAX_VALUE);
              }
            
            if(a[i]<b[j]){
                
                if(al.get(k)!=a[i]){
                    // if(k==0){
                    //   al.remove(0);
                    // }
                     al.add(a[i]);
                     k++;
                }
                i++;
              
            }else{
                if(al.get(k)!=b[j]){
                    //  if(k==0){
                    //   al.remove(0);
                    // }
                    
                    k++;
                    al.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(al.get(k)!=a[i]){
                k++;
              al.add(a[i]);
           
            }
             i++;
        }
         while(j<b.length){
             if(al.get(k)!=b[j]){
                 k++;
                al.add(b[j]);
               
             }
               j++;
        }
        al.remove(0);
        return al;
    }
}
