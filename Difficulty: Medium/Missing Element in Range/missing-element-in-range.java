class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        while(low<=high){
            boolean notFound=true;
            if(hs.contains(low)){
               notFound=false; 
            
            }
            if(notFound){
                al.add(low);
            }
            low++;
        }
    return al;
    }
}