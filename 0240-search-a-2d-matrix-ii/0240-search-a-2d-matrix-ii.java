class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int i=0;
       int j=0;
       while(i<matrix.length && j<matrix[0].length){
           
           if(matrix[i][j]==target){
            return true;
           }
          
          
            if(j==matrix[0].length-1){
            i++;
            j=0;
           }else{
             j++;
           }
       }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna