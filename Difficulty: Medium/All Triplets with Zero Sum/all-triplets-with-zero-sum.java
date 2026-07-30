class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List <List<Integer>> al=new ArrayList<>();
       for(int i=0;i<=arr.length-3;i++){
           for(int j=i+1;j<=arr.length-2;j++){
               int sum=arr[i]+arr[j];
               for(int k=j+1;k<arr.length;k++){
                 
                   if((sum+arr[k])==0){
                        List <Integer> a=new ArrayList<>();
                        a.add(i);
                        a.add(j);
                        a.add(k);
                        al.add(a);
                    }
               }
           }
       }
       return al; 
    }
}