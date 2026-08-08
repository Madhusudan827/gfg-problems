class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat[i].length;j++){
               al.add(mat[i][j]);
           }
       }
      Collections.sort(al);
      return al;
    }
}