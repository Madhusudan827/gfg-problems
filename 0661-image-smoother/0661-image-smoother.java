class Solution {

    public int[][] imageSmoother(int[][] img) {
        int [][] arr=new int [img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                int ele=img[i][j];
                int top=top(i-1,j,img);
                int left=left(i,j-1,img);
                int down=down(i+1,j,img);
                int right=right(i,j+1,img);
                //  up side diagonals
                int leftDiagonal=leftDiagonal(i-1,j-1,img);
                int rightDiagonal=rightDiagonal(i-1,j+1,img);
                // down side diagonals
                int lftDiaDown=lftDiaDown(i+1,j-1,img);
                int rghtDiaDown=rghtDiaDown(i+1,j+1,img);
                int count=0;
                if(top!=Integer.MIN_VALUE){
                    count++;
                }
                if(left!=Integer.MIN_VALUE){
                    count++;
                }
                if(down!=Integer.MIN_VALUE)
                count++;
                if(right!=Integer.MIN_VALUE)
                count++; 
                if(leftDiagonal!=Integer.MIN_VALUE)
                count++;
                if(rightDiagonal!=Integer.MIN_VALUE)
                count++;
                if(lftDiaDown!=Integer.MIN_VALUE)
                count++;
                if(rghtDiaDown!=Integer.MIN_VALUE)
                count++;
                // performing sum
                int totalSum=0;
                if(top!=Integer.MIN_VALUE){
                      totalSum+=top;
                }
                if(left!=Integer.MIN_VALUE){
                    totalSum+=left;
                }
                if(down!=Integer.MIN_VALUE)
                  totalSum+=down;
                if(right!=Integer.MIN_VALUE)
                  totalSum+=right;
                if(leftDiagonal!=Integer.MIN_VALUE)
                 totalSum+=leftDiagonal;
                if(rightDiagonal!=Integer.MIN_VALUE)
                  totalSum+=rightDiagonal;
                if(lftDiaDown!=Integer.MIN_VALUE)
                  totalSum+=lftDiaDown;
                if(rghtDiaDown!=Integer.MIN_VALUE)
                  totalSum+=rghtDiaDown;

                arr[i][j]=(int)Math.floor((totalSum+ele)/(count+1));
            }
        }
        return arr;
    }
    private static int  top(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i>=0 && j<=colLength){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
    private static int  left(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i<=rowLength && j>=0){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
    private static int  down(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i<=rowLength ){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
    private static int  right(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(  j<=colLength){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
    private static int  leftDiagonal(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i>=0 && j>=0){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
    private static int  rightDiagonal(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i>=0 && j<=colLength){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
    private static int rghtDiaDown(int i,int j,int [][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i<=rowLength && j<=colLength){
            return img[i][j];
        }
            return Integer.MIN_VALUE;
        
    }
    private static int lftDiaDown(int i,int j,int[][] img){
        int rowLength=img.length-1;
        int colLength=img[0].length-1;

        if(i<=rowLength && j>=0){
            return img[i][j];
        }else {
            return Integer.MIN_VALUE;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna