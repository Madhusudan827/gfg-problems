class Solution {
    public int kthSmallest(int[][] mat, int k) {
      ArrayList<Integer> al=new ArrayList<Integer>();
      for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[i].length;j++){
             al.add(mat[i][j]);
          }
      }
      Collections.sort(al);
   
      return al.get(k-1);
        
    }
}
