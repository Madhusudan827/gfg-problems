class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           if(arr[i]<target){
               al.add(arr[i]);
           }
       }
       return al;
    }
}