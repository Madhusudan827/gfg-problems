class Solution {
    public void rotate(int[][] matrix) {
        int[][] mat=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[i][j]=matrix[i][j];
            }
        }
        for(int j=0;j<=matrix[0].length-1;j++){
            for(int i=0;i<=matrix.length-1;i++){
                matrix[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int k=matrix[0].length-1;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna