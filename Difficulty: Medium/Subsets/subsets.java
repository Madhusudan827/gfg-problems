class Solution {
    
    public static void backtracking(int arr[],ArrayList<Integer> al,ArrayList<ArrayList<Integer>> group,int i){
        if(i==arr.length){
        group.add(new ArrayList<>(al));
        return ;
        }
        al.add(arr[i]);
       backtracking(arr,al,group,i+1);
       al.remove(al.size()-1);
          backtracking(arr,al,group,i+1);
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
       ArrayList<ArrayList<Integer>> group=new ArrayList<>();
       
       ArrayList<Integer> al=new ArrayList<>();
        backtracking(arr,al,group,0);
        return group;
    }
}