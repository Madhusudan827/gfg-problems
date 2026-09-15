
class Solution {
    static ArrayList<ArrayList<Integer>> group=new ArrayList<>();
    public static void nQueens(char [][] a,int row){
        if(row==a.length){
           StoreBoard(a);
            return ;
        }
        //kaam
        for(int i=0;i<a.length;i++){
            if(isSafe(a,row,i)){
                a[row][i]='Q';
                  nQueens(a,row+1);
                 a[row][i]='.';
            }

        }
    }
    public static boolean isSafe(char [][]a,int row,int col){
        //top
        for(int i=row-1;i>=0;i--){
            if(a[i][col]=='Q'){
                return false;
            }
        }
        //left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(a[i][j]=='Q'){
                return false;
            }
        }
        //right
        for(int i=row-1,j=col+1;i>=0 && j<a.length;i--,j++){
             if(a[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void StoreBoard(char [] []a){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<a.length;j++){
               if(a[i][j]=='Q'){
                   al.add(j+1);
               }
            }
           
        }
        group.add(new ArrayList<>(al));
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        group.clear();
        char a[][]=new char[n][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]='.';
            }
        }
        nQueens(a, 0);
        return group;
    }
}