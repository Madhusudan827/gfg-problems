class Solution {
    int[][] sortedMatrix(int mat[][]) {
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat[i].length;j++){
               al.add(mat[i][j]);
             }
       }
       Collections.sort(al);
     int k=0;
     for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat[i].length;j++){
             if(k<al.size()){
                 mat[i][j]=al.get(k);
                 k++;
             }
         }
     }
      
        return mat;
    }
}