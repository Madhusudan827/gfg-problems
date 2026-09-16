
class Solution {
    public static boolean isValidCell(int[][] board,int row ,int col,int ele){
          // for rows
          for(int i=0;i<board.length;i++){
             if(i!=col && board[row][i]==ele){
                return false;
             }
          }
          // for columns
           for(int i=0;i<board.length;i++){
             if(i!=row && board[i][col]==ele){
                return false;
             }
          }
          //for 3X3
          int startrow= (row/3)*3;
          int startcol=(col/3)*3;
          for(int i=startrow;i<startrow+3;i++){
             for(int j=startcol;j<startcol+3;j++){
                if((i!=row  || j!=col)&& board[i][j]==ele){
                     return false;
                 }
             }
          }
          return true;
    }
    public boolean isValid(int[][] board) {
         // acessing board elements
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){

                 int ele=board[i][j];
                if(ele !=0){
                    if( ! isValidCell (board,i,j,ele)){
                    return false;
                }
                }

            }
        }
        return true;
    }
}