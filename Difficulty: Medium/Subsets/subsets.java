class Solution {
    
    public static void sets(int arr[],int idx,ArrayList<Integer> oneD,ArrayList<ArrayList<Integer>> group){
        
     
             if(idx==arr.length){
                 group.add(new ArrayList<>(oneD) );
                 return ;
             }
             
            
             oneD.add(arr[idx]);
             sets(arr,idx+1,oneD,group);
             oneD.remove(oneD.size()-1);
             sets(arr,idx+1,oneD,group);
         
        
    }
    
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
     ArrayList<ArrayList<Integer>> group = new ArrayList<>();
     ArrayList<Integer> oneD=new ArrayList<>();
     sets(arr,0,oneD,group);
     return group;
        
    }
}