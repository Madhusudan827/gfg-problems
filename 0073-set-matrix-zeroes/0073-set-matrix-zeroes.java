class Solution {


    public void setZeroes(int[][] matrix) {
      ArrayList<ArrayList<Integer>> store=new ArrayList<>();
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                store.add(new ArrayList<>(List.of(i,j)));
            }
        }
      }
       for(int i=0;i<store.size();i++){
            fillZeros(store.get(i).get(0),store.get(i).get(1),matrix);
       }

    }

    static private void fillZeros(int i,int j,int[][] matrix){
           int rowLen=matrix.length;
           int colLen=matrix[0].length;
           // changing row
           for(int k=i;k<rowLen;k++){
               matrix[k][j]=0;
           }
            for(int k=i;k>=0;k--){
               matrix[k][j]=0;
           }

          // changing col
           for(int k=j;k<colLen;k++){
               matrix[i][k]=0;
           }
            for(int k=j;k>=0;k--){
               matrix[i][k]=0;
           }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna