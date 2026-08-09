class Solution {
    public ArrayList<Integer> bitonicGenerator(int arr[]) {
        ArrayList<Integer> al=new ArrayList<>();
        
        //for even
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            if(i%2==0){
                even.add(arr[i]);
            }
        }
        Collections.sort(even);
        //for odd
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        for(int i=0;i<even.size();i++){
            al.add(even.get(i));
        }
         for(int i=odd.size()-1;i>=0;i--){
            al.add(odd.get(i));
        }
        
        return al;
    }
}
